package com.marcillino.irlan.resources;

import com.marcillino.irlan.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * classe de recurso baseado na entidade User
 */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<Usuario> findAll(){
        Usuario usuario = new Usuario(null, "IRLAN", "IRLAN@GMAIL.COM", "9999999", "12345");

        return ResponseEntity.ok().body(usuario); //retorna o ok do HTTP com o .body para retornar o corpo da resposta
    }
}
