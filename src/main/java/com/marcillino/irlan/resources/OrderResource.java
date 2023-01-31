package com.marcillino.irlan.resources;

import com.marcillino.irlan.entities.Order;
import com.marcillino.irlan.entities.Usuario;
import com.marcillino.irlan.services.OrderService;
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
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService service ;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
       List<Order> orders = service.findAll();

        return ResponseEntity.ok().body(orders); //retorna o ok do HTTP com o .body para retornar o corpo da resposta
    }

    @GetMapping(value ="/{id}")
        public ResponseEntity<Order> findById(@PathVariable Long id){
        Order order = service.findById(id);
        return ResponseEntity.ok().body(order);
    }
}
