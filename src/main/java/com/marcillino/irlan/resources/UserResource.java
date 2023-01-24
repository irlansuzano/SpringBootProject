package com.marcillino.irlan.resources;

import com.marcillino.irlan.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * classe de recurso baseado na entitdade User
 */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1, "IRLAN", "IRLAN@GMAIL.COM", "9999999", "12345");

        return ResponseEntity.ok().body(user); //retorna o ok do HTTP com o .body para retornar o corpo da resposta
    }
}
