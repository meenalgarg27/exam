package com.game.transformers.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.game.transformers.model.ApplicationResponse;
import com.game.transformers.model.TechSpecModel;
import com.game.transformers.model.Transformer;
import com.game.transformers.model.TransformerRequest;
import com.game.transformers.model.TransformerResponse;
import com.game.transformers.service.GameService;

public class GameControllerTest {

	@Mock
	GameService gameService;

	GameController gameController;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		gameController = new GameController(gameService);
	}

	@Test
	public void createTransformerTest_whenRequestIsValid() throws Exception {
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(gameController).build();
		TransformerRequest transformerRequest = new TransformerRequest();
		Transformer transformer = new Transformer();
		transformer.setName("Soundwave");
		transformer.setType("Decepticons");
		TechSpecModel techSpecs = new TechSpecModel();
		techSpecs.setStrength(8);
		techSpecs.setIntelligence(9);
		techSpecs.setSpeed(2);
		techSpecs.setEndurance(6);
		techSpecs.setRank(7);
		techSpecs.setCourage(5);
		techSpecs.setFirepower(6);
		techSpecs.setSkill(10);
		transformer.setTechSpecs(techSpecs);
		transformerRequest.setTransformer(transformer);
		ApplicationResponse transformerResponse = new ApplicationResponse();
		when(gameService.createTransformer(transformerRequest.getTransformer())).thenReturn(transformerResponse);
		mockMvc.perform(post("/api/transformer").content(asJsonString(transformerRequest))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());

	}

	@Test
	public void createTransformerTest_whenNameIsBlank() throws Exception {
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(gameController).build();
		TransformerRequest transformerRequest = new TransformerRequest();
		Transformer transformer = new Transformer();
		// transformer.setName("Soundwave");
		transformer.setType("Decepticons");
		TechSpecModel techSpecs = new TechSpecModel();
		techSpecs.setStrength(8);
		techSpecs.setIntelligence(9);
		techSpecs.setSpeed(2);
		techSpecs.setEndurance(6);
		techSpecs.setRank(7);
		techSpecs.setCourage(5);
		techSpecs.setFirepower(6);
		techSpecs.setSkill(10);
		transformer.setTechSpecs(techSpecs);
		transformerRequest.setTransformer(transformer);
		TransformerResponse transformerResponse = new TransformerResponse();
		System.out.println(asJsonString(transformerRequest));
		mockMvc.perform(post("/api/transformer").content(asJsonString(transformerRequest))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isBadRequest());
	}
	
	@Test
	public void createTransformerTest_whenTypeIsWrong() throws Exception {
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(gameController).build();
		TransformerRequest transformerRequest = new TransformerRequest();
		Transformer transformer = new Transformer();
		// transformer.setName("Soundwave");
		transformer.setType("Decepticons");
		TechSpecModel techSpecs = new TechSpecModel();
		techSpecs.setStrength(8);
		techSpecs.setIntelligence(9);
		techSpecs.setSpeed(2);
		techSpecs.setEndurance(6);
		techSpecs.setRank(7);
		techSpecs.setCourage(5);
		techSpecs.setFirepower(6);
		techSpecs.setSkill(10);
		transformer.setTechSpecs(techSpecs);
		transformerRequest.setTransformer(transformer);
		TransformerResponse transformerResponse = new TransformerResponse();
		System.out.println(asJsonString(transformerRequest));
		mockMvc.perform(post("/api/transformer").content(asJsonString(transformerRequest))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isBadRequest());
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
