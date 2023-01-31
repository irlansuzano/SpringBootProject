package com.marcillino.irlan.repositories;

import com.marcillino.irlan.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

// a anotação @Repository nessa situação é opcional pois elajá herda do JPARepository, não sendo necessario
public interface UserRepository extends JpaRepository<Usuario, Long> {

}
