package com.bootcamp.demoSpringBoot.user;

import com.bootcamp.demoSpringBoot.user.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // Buscar un usuario por id.
    // SELECT * FROM users WHERE id=1;
    @Cacheable("usuarios")
    User findById(int id);

    // Borrar un usuario por id.
    // DELETE FROM users WHERE id=1;
    @Cacheable("usuarios")
    void deleteById(int id);

    // Añadir usuario.
    // INSERT INTO users (id, name, birth_date) VALUES (5, 'Lucas', '1970-08-05');
    @Cacheable("usuarios")
    User save(User user);


    // Buscar todos los usuarios.
    @Cacheable("usuarios")
    List<User> findAll() throws DataAccessException;

}
