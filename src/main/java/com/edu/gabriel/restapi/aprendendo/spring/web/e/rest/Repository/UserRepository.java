package com.edu.gabriel.restapi.aprendendo.spring.web.e.rest.Repository;

import com.edu.gabriel.restapi.aprendendo.spring.web.e.rest.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(User user){
        if (user.getId() == null){
            System.out.println("SAVE - Recebendo usuário na camado do repositório");
        } else {
            System.out.println("UPDATE - Recebendo usuário na camado do repositório");
        }
        System.out.println(user);
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<User> findAll(){
        System.out.println("Listando usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("GBX, o trem", "23211222"));
        users.add(new User("Gabriel fofo", "fofo123"));
        return users;
    }

    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("Gabriel Freefire", "freefire123");
    }

    public User findByUserName(String username){
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
        return new User("gabriel t", "bolsonaro22");
    }
}
