package com.bootcamp.demoSpringBoot.user;

import com.bootcamp.demoSpringBoot.user.User;
import com.bootcamp.demoSpringBoot.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    // Mostrar todos los usuarios.
    public Users showAll() {
        Users users = new Users();
        users.getUserList().addAll(this.userRep.findAll());
        return users;
    }

}
