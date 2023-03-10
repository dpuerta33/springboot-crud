package com.bootcamp.demoSpringBoot.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    private UserRepository userRepository;

    // Obtener usuario.
    @GetMapping("/api/v1/users/{id}")
    public User getUser (@PathVariable(name = "id") Integer id){
        return this.userService.getUser(id);
    }

    // Borrar usuario.
    @DeleteMapping("/api/v1/users/{id}")
    public Users deleteUser (@PathVariable(name = "id") Integer id){
        userService.deleteUser(id);
        return userService.showAll(); // Retorna una lista con todos los usuarios para comprobar que se han realizado los cambios.
    }

    // Crear usuario.

    @PostMapping("/api/v1/users")
    public Users createUser (@RequestBody User user) {
        userService.createUser(user);
        return userService.showAll(); // Retorna una lista con todos los usuarios para comprobar que se han realizado los cambios.
    }

    // Modificar usuario.
    @PutMapping("/api/v1/users")
    public Users alterUser (@RequestBody User user) {
        userService.alterUser(user);
        return userService.showAll(); // Retorna una lista con todos los usuarios para comprobar que se han realizado los cambios.
    }

}
