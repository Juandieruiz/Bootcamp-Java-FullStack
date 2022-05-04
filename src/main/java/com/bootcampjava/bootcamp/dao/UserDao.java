package com.bootcampjava.bootcamp.dao;

import com.bootcampjava.bootcamp.models.User;

import java.util.List;

// Data access object
// La interface es donde indicamos que funciones deben tener una clase
// Si una clase implementa esta interface, los metodos que hay aquí son obligatorios
public interface UserDao {

    List<User> getAllUsers();

}
