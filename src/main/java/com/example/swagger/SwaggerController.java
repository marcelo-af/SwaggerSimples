package com.example.swagger;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class SwaggerController {

	
	/*url para ser colocada no browser http://localhost:8080/swagger-ui.html
	 * */
	
	/*Colocar no application.properties
	  spring.mvc.pathmatch.matching-strategy=ant-path-matcher
*/
	
	/*Acrescentar as dependencias (springfox-swagger2 -> 3.0.0  e springfox-swagger-ui -> 2.9.2) no POM
	 * */
	
	
	@GetMapping("/informacao")
	@ApiResponses(value = {
			@ApiResponse(code = 545, message = "Erro código não mapeado") 
	})/*Mapeia as possiveis respostas, passando o code e message*/
	@ApiOperation(value = "Outra mensagem") /*Descrição sobre o que a API faz porem é opcional*/
	public String informacao() {
		return "Essa chamada mostra mais conteudo para a chamada informacao.";
	} 
	
	@GetMapping
	public String getConsulta() {
		return "OK";
	} 
	
	@GetMapping("/parametro/{x}")
	public String ok(@RequestParam("x") String x) {
		return x;
	}
	
	@PostMapping
	public String post() {
		return "metodo post retornado com sucesso.";		
	}
	
	@PutMapping
	public String putCriaAtualiza() {
		return "Metodo put retornado com sucesso.";
	}
	
	@DeleteMapping
	public String deleteItem() {
		return "Metódoo delete retornado com sucesso.";
	}
	
	/*No Swagger ele exibe o nome do metodo exemplo putCriaAtualiza()*/
}
