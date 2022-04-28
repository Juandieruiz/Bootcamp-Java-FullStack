package com.bootcampjava.bootcamp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    // Request Mapping con la ruta test
    @RequestMapping(value = "test")
    public List<String> test() {
        return List.of("test1", "test2", "test3");
    }


}
