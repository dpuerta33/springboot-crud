package com.bootcamp.demoSpringBoot.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

    @Autowired
    MessageService messServ;

    @GetMapping("/api/v1/message")
    public String showMessage (){
        System.out.println(messServ.getMessage());
        return messServ.getMessage();
    }

}
