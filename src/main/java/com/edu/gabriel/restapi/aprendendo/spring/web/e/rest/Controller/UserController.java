package com.edu.gabriel.restapi.aprendendo.spring.web.e.rest.Controller;

import com.edu.gabriel.restapi.aprendendo.spring.web.e.rest.Model.User;
import com.edu.gabriel.restapi.aprendendo.spring.web.e.rest.Repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <h1>Controller referente ao usuário</h1>
 * permite o uso e manipulação das requisições http para usuário
 * <br>
 * <b> http://localhost:8080/swagger-ui.html </b>
 * */

@RestController
@RequestMapping("/users")
@Tag(name = "Teste Web API documentation")
public class UserController {
    @Autowired
    private UserRepository repository;

    @Operation(summary = "Realiza a listagem de todos os usuários", method = "GET")
    @GetMapping()
    public List<User> list(){
        return repository.findAll();
    }
    @Operation(summary = "Realiza a entrada de dados de usuário", method = "POST")
    @PostMapping
    public void save(@RequestBody User user){
        repository.save(user);
    }
    @Operation(summary = "Atualiza forçadamente os dados do usuário", method = "PUT")
    @PutMapping
    public void update(@RequestBody User user){
        repository.save(user);
    }
    @Operation(summary = "Busca o usuário no banco de dados através do nome de usuário cadastrado", method = "GET")
    @GetMapping("/{username}")
    public User find(@PathVariable("/username") String username) {
        return repository.findByUserName(username);
    }
    @Operation(summary = "Remove o usuário do sistema identificado pelo id", method = "DELETE")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("/id") Integer id){
        repository.deleteById(id);
    }



}
