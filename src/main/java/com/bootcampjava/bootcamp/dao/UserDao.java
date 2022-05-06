package com.bootcampjava.bootcamp.dao;

import com.bootcampjava.bootcamp.models.Usuario;

import java.util.List;

// Data access object
// La interface es donde indicamos que funciones deben tener una clase
// Si una clase implementa esta interface, los metodos que hay aquí son obligatorios
public interface UserDao {

    List<Usuario> getUsuarios();

}
