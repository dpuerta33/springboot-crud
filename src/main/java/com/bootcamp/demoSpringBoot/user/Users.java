package com.bootcamp.demoSpringBoot.user;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<User> users;


    public List<User> getUserList() {
        if (users == null) {
            users = new ArrayList<>();
        }
        return users;
    }
}
