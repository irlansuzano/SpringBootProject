package com.marcillino.irlan.resources;

import com.marcillino.irlan.entities.Category;
import com.marcillino.irlan.entities.Usuario;
import com.marcillino.irlan.services.CategoryService;
import com.marcillino.irlan.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * classe de recurso baseado na entidade Category
 */
@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service ;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
       List<Category> categories = service.findAll();

        return ResponseEntity.ok().body(categories); //retorna o ok do HTTP com o .body para retornar o corpo da resposta
    }

    @GetMapping(value ="/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category category = service.findById(id);
        return ResponseEntity.ok().body(category);
    }
}
