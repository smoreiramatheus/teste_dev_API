package projetoteste.tutorialrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import projetoteste.tutorialrestapi.model.UsuarioModel;
import projetoteste.tutorialrestapi.repository.UsuarioRepository;

@RestController
public class UsuarioConntroller {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping(path = "/api/usuario/{codigo}") // metodo consulta usuário pelo codigo
	public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
		return repository.findById(codigo)
				.map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping(path = "/api/usuario/salvar")
	public UsuarioModel salvar(@RequestBody UsuarioModel usuario) {
		return repository.save(usuario);
	}
}


// Fizemos um findById na interface repository.
// o metodo map verificará se foi inserido algo na requisição se sim ele colocará no corpo da requisição como registro
// caso contrário ele informará (not found) não encontrado e informará um build (construir) já que nada fora enontrado

//requestbody = os dados do usuários serão enviados no corpo da requisição



// classe criada para fazer consultas e salvar no BD