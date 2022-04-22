package com.bootcampjava.bootcamp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "test")
    public List<String> test() {
        return List.of("test", "test2", "test3");
    }


}
