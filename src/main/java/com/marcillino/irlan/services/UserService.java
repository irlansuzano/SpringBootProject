package com.marcillino.irlan.services;

import com.marcillino.irlan.entities.Usuario;
import com.marcillino.irlan.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Classe de serviço de persistencia ao banco relacionado a entidade Usuario
 */

@Service //registra a classe como um service do spring e permite ser injetado com o AutoWired
public class UserService {

    @Autowired
    private UserRepository userRepository;


    /**
     * método responsável pelo retorno de uma lista contendo todos os usuarios cadastrados na base
     * @return List<Usuario>
     */
    public List<Usuario> findAll() {
        return userRepository.findAll();
    }

    public Usuario findById(Long id){
        Optional<Usuario> usuario =userRepository.findById(id);
        return usuario.get(); //retorna o que tiver dentro do optional
    }

}
