package com.example.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 /*Permite utilizar o swagger porem o mesmo é adicionado no POM*/
public class SwaggertesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggertesteApplication.class, args);
	}

}
