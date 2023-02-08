package com.bootcamp.demoSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    // Obtener usuario.
    @GetMapping("/api/v1/users/{id}")
    public User getUser (@PathVariable(name = "id") Integer id){
        return this.userService.getUser(id);
    }

    // Borrar usuario.
    @DeleteMapping("/api/v1/users/{id}")
    public void deleteUser (@PathVariable(name = "id") Integer id){
        userService.deleteUser(id);
    }

    // Crear usuario.
    @PostMapping("/api/v1/users")
    public void createUser (@RequestBody User user) {
        userService.createUser(user);
    }

    // Modificar usuario.
    @PutMapping("/api/v1/users")
    public void alterUser (@RequestBody User user) {
        userService.alterUser(user);
    }

}
