package com.bootcamp.demoSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    @Autowired
    UserRepository userRep;

    // Obtener usuario.
    public User getUser (int id){
        return userRep.findById(id);
    }

    // Borrar usuario.
    public void deleteUser (int id){
        userRep.deleteById(id);
    }

    // Crear usuario.
    public void createUser(User user) {
        userRep.save(user);
    }

    // Modificar usuario.
    public void alterUser(User user) {
        userRep.save(user);
    }

}
