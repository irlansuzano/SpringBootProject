package com.marcillino.irlan.repositories;

import com.marcillino.irlan.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long> {

}
