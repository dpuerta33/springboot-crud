package com.bootcamp.demoSpringBoot;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


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

}
