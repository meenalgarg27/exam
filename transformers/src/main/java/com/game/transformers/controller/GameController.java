package com.game.transformers.controller;


import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.game.transformers.model.ApplicationResponse;
import com.game.transformers.model.TransformerRequest;
import com.game.transformers.service.GameService;

@RestController
@RequestMapping("/api/transformer")
public class GameController {
	private GameService gameService;

	public GameController(GameService gameService) {
		super();
		this.gameService = gameService;
	}

	/*
	 * @RequestMapping(method= RequestMethod.POST, value="/verify", produces =
	 * "application/json") public @ResponseBody InitialVerificationResponse
	 * verifyUserForIB(@RequestBody TransformerRequest transformerRequest) { return
	 * userService.registerUser(user); }
	 */

	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody ApplicationResponse createTransformer(@Valid @RequestBody TransformerRequest transformerRequest) {
		return gameService.createTransformer(transformerRequest.getTransformer());
	}
	
	@RequestMapping(method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody ApplicationResponse updateTransformer(@Valid @RequestBody TransformerRequest transformerRequest) {
		return gameService.createTransformer(transformerRequest.getTransformer());
	}
	
	@RequestMapping(method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody ApplicationResponse deleteTransformer(@Valid @RequestBody TransformerRequest transformerRequest) {
		return gameService.createTransformer(transformerRequest.getTransformer());
	}	
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ApplicationResponse listTransformers() {
		return gameService.getTransformers();
	}	
}
