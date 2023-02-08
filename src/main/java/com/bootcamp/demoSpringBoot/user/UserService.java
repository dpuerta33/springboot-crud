package com.bootcamp.demoSpringBoot.user;

import com.bootcamp.demoSpringBoot.user.User;
import com.bootcamp.demoSpringBoot.user.UserRepository;
import io.micrometer.core.instrument.config.validate.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

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
        validateUser(user);
        userRep.save(user);
    }

    // Modificar usuario.
    public void alterUser(User user) {
        validateUser(user);
        userRep.save(user);
    }

    // Mostrar todos los usuarios.
    public Users showAll() {
        Users users = new Users();
        users.getUserList().addAll(this.userRep.findAll());
        return users;
    }

    // Validaciones.
    public void validateUser(User user){
        if (user.getName()==null && user.getBirthDate() == null){
            throw new IllegalArgumentException("Los campos estan VACIOS.");
        }else if (user.getBirthDate() == null){
            throw new IllegalArgumentException("La FECHA es incorrecta.");
        } else if (user.getName()==null) {
            throw new IllegalArgumentException("El NOMBRE es incorrecto.");
        }
    }
}
