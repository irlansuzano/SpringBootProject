package com.marcillino.irlan.config;

import com.marcillino.irlan.entities.Order;
import com.marcillino.irlan.entities.Usuario;
import com.marcillino.irlan.repositories.OrderRepository;
import com.marcillino.irlan.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test") //identifica que só vai rodar essa configuração quando estivermos no perfil de teste
public class TestConfig implements CommandLineRunner {

    @Autowired  //Injeta a dependencia e associa a instancia do userRepository
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception { //método da interface CommandLineRunner, roda tudo que estiver dentro dele
        Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2014-06-20T19:53:07Z"), u2);
        Order o3 = new Order(null, Instant.parse("2012-06-20T19:53:07Z"), u2);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
