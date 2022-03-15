package projetoteste.tutorialrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
	
	@GetMapping(path = "/api/status") // metodo que poderá ser solicitado quando houver uma requisição 
	public String check() {
		return "Online!";
	}
}


// antes de executar a aplicação devemos fazer uso da dependencia JPA e utilizar a conexão junto a depenencia
// jpa dependencia do java que efetua conexão com acesso ao BD (Java Persistem Api)


//classe criada para informar o status da aplicação ("online!")