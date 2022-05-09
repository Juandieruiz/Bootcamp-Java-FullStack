package com.bootcampjava.bootcamp.dao;

import com.bootcampjava.bootcamp.dao.UserDao;
import com.bootcampjava.bootcamp.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//Patrón de diseño
@Repository // Repositorio de Base de Datos
@Transactional // Consultas de Transacción SQL(en fragmentos)
public class UserDaoImpl implements UserDao {

    @PersistenceContext // Contexto de Persistencia en la BBDD
    private EntityManager entityManager; // Nos ayudara hacer la conexión con la BBDD

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
