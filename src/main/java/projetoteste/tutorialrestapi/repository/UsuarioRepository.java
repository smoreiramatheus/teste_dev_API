package projetoteste.tutorialrestapi.repository;

import org.springframework.data.repository.CrudRepository;

import projetoteste.tutorialrestapi.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

}


//classe que ja vem com metodos pre programados com as principais funcionalidades (busca por ID, salvar etc.)