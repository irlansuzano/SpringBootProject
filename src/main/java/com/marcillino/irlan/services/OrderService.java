package com.marcillino.irlan.services;

import com.marcillino.irlan.entities.Order;
import com.marcillino.irlan.entities.Usuario;
import com.marcillino.irlan.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Classe de serviço de persistencia ao banco relacionado a entidade Usuario
 */

@Service //registra a classe como um service do spring e permite ser injetado com o AutoWired
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    /**
     * método responsável pelo retorno de uma lista contendo todos os pedidos cadastrados na base
     * @return List<Usuario>
     */
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    /**
     * método responsavel pelo retorno de um pedido pelo id
     * @param id
     * @return
     */
    public Order findById(Long id){
        Optional<Order> order = orderRepository.findById(id);
        return order.get(); //retorna o que tiver dentro do optional
    }

}
