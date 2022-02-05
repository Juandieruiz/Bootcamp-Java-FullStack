package com.bootcampjava.bootcamp.controllers;

import com.bootcampjava.bootcamp.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    // Request Mapping con la ruta test
    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(213L);
        user.setName("Juan");
        user.setLastname("Perez");
        user.setEmail("juan@juan.com");
        user.setPassword("123456");
        user.setPhone("123456789");

        return user;
    }

    @RequestMapping(value = "users")
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setId(0L);
        user.setName("Juan");
        user.setLastname("Gomez");
        user.setEmail("juan@gomez.com");
        user.setPassword("a123");
        user.setPhone("6729292");

        User user1 = new User();
        user1.setId(1L);
        user1.setName("Jhon");
        user1.setLastname("Stevens");
        user1.setEmail("Jhon@Stevens.com");
        user1.setPassword("e123");
        user1.setPhone("123123123");

        User user2 = new User();
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
    public User editUser() {
        User user1 = new User();
        user1.setName("Juan");
        user1.setLastname("Perez");
        user1.setEmail("juan@juan.com");
        user1.setPassword("123456");
        user1.setPhone("123456789");

        return user1;
    }

    @RequestMapping(value = "user11")
    public User deleteUser() {
        User user1 = new User();
        user1.setName("Juan");
        user1.setLastname("Perez");
        user1.setEmail("juan@juan.com");
        user1.setPassword("123456");
        user1.setPhone("123456789");

        return user1;
    }

    @RequestMapping(value = "user111")
    public User searchUser() {
        User user1 = new User();
        user1.setName("Juan");
        user1.setLastname("Perez");
        user1.setEmail("juan@juan.com");
        user1.setPassword("123456");
        user1.setPhone("123456789");

        return user1;
    }


}
