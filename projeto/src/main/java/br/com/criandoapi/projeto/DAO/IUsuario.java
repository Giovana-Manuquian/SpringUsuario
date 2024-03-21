package br.com.criandoapi.projeto.DAO;

import br.com.criandoapi.projeto.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IUsuario extends CrudRepository<Usuario, Integer> {
    Optional<Usuario> findAllById(Integer id);
}
