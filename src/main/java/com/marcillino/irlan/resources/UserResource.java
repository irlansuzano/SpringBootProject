package com.marcillino.irlan.resources;

import com.marcillino.irlan.entities.Usuario;
import com.marcillino.irlan.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * classe de recurso baseado na entidade Usuario
 */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service ;

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll(){
       List<Usuario> usuarios = service.findAll();

        return ResponseEntity.ok().body(usuarios); //retorna o ok do HTTP com o .body para retornar o corpo da resposta
    }

    @GetMapping(value ="/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id){
        Usuario usuario = service.findById(id);
        return ResponseEntity.ok().body(usuario);
    }
}
