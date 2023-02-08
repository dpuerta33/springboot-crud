package com.bootcamp.demoSpringBoot.user;

import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.*;
import org.wildfly.common.annotation.NotNull;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "usuarios")
public class User implements Serializable {
    @Id
    @Column
    @NotNull
    @ApiModelProperty(position = 0)
    private Integer id;

    @Column
    @NotNull
    @ApiModelProperty(position = 1)
    private String name;

    @Column
    @NotNull
    @ApiModelProperty(position = 3)
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
