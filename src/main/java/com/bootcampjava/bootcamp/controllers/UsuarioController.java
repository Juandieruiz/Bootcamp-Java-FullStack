package com.bootcampjava.bootcamp.controllers;

import com.bootcampjava.bootcamp.dao.UserDao;
import com.bootcampjava.bootcamp.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController  {

    // Request Mapping con la ruta test
    @RequestMapping(value = "user/{id}")
    public Usuario getUser(@PathVariable Long id) {
        Usuario user = new Usuario();
        user.setId(213L);
        user.setName("Juan");
        user.setLastname("Perez");
        user.setEmail("juan@juan.com");
        user.setPassword("123456");
        user.setPhone("123456789");

        return user;
    }

    @RequestMapping(value = "users")
    public List<Usuario> getUsers() {
        List<Usuario> userList = new ArrayList<>();
        Usuario user = new Usuario();
        user.setId(0L);
        user.setName("Juan");
        user.setLastname("Gomez");
        user.setEmail("juan@gomez.com");
        user.setPassword("a123");
        user.setPhone("6729292");

        Usuario user1 = new Usuario();
        user1.setId(1L);
        user1.setName("Jhon");
        user1.setLastname("Stevens");
        user1.setEmail("Jhon@Stevens.com");
        user1.setPassword("e123");
        user1.setPhone("123123123");

        Usuario user2 = new Usuario();
        user2.setId(2L);
        user2.setName("María");
        user2.setLastname("Gonzalez");
        user2.setEmail("Maria@Gonzalez.com");
        user2.setPassword("i123");
        user2.setPhone("123123123");

        userList.add(user);
        userList.add(user1);
        userList.add(user2);

        return userList;

    }

    @RequestMapping(value = "user1")
    public Usuario editUser() {
        Usuario user1 = new Usuario();
        user1.setName("Juan");
        user1.setLastname("Perez");
        user1.setEmail("juan@juan.com");
        user1.setPassword("123456");
        user1.setPhone("123456789");

        return user1;
    }

    @RequestMapping(value = "user11")
    public Usuario deleteUser() {
        Usuario user1 = new Usuario();
        user1.setName("Juan");
        user1.setLastname("Perez");
        user1.setEmail("juan@juan.com");
        user1.setPassword("123456");
        user1.setPhone("123456789");

        return user1;
    }

    @RequestMapping(value = "user111")
    public Usuario searchUser() {
        Usuario user1 = new Usuario();
        user1.setName("Juan");
        user1.setLastname("Perez");
        user1.setEmail("juan@juan.com");
        user1.setPassword("123456");
        user1.setPhone("123456789");

        return user1;
    }

}
