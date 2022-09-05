package com.bootcampjava.bootcamp.dao;

import com.bootcampjava.bootcamp.dao.UserDao;
import com.bootcampjava.bootcamp.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Patrón de diseño
@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
