package com.game.transformers.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build().pathMapping("/")
				.apiInfo(this.metaData());
	}

	private ApiInfo metaData() {
		Contact contact = new Contact("Meenal", "", "meenalgarg27@gmail.com");
		return new ApiInfo("Transormer Game", "Todo some description", "1.0", "NA", contact, "NA", "NA",
				new ArrayList<>());
	}

}
