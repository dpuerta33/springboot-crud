package com.bootcamp.demoSpringBoot.user;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;
import org.wildfly.common.annotation.NotNull;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "usuarios")
public class User implements Serializable {
    @Id
    @Column
    @NotNull
    private Integer id;

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private Date birthDate;

    public User() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
