package com.bootcampjava.bootcamp.dao;

import com.bootcampjava.bootcamp.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//Patrón de diseño
@Repository // Repositorio de Base de Datos
@Transactional // Consultas de Transacción SQL(en fragmentos)
public class UserDaoImpl implements UserDao {

    // Contexto de Persistencia en la BBDD
    @PersistenceContext
    // Nos ayudará hacer la conexión con la BBDD
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query = "FROM User";
        return entityManager.createQuery(query).getResultList();
    }
}
