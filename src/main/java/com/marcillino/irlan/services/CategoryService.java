package com.marcillino.irlan.services;

import com.marcillino.irlan.entities.Category;
import com.marcillino.irlan.entities.Usuario;
import com.marcillino.irlan.repositories.CategoryRepository;
import com.marcillino.irlan.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Classe de serviço de persistencia ao banco relacionado a entidade Category
 */

@Service //registra a classe como um service do spring e permite ser injetado com o AutoWired
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    /**
     * método responsável pelo retorno de uma lista contendo todos os usuarios cadastrados na base
     * @return List<Category>
     */
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> category =categoryRepository.findById(id);
        return category.get(); //retorna o que tiver dentro do optional
    }

}
