package com.bootcamp.demoSpringBoot.message;

import com.bootcamp.demoSpringBoot.message.MessageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImp implements MessageService {

    @Value("${course.message}")
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

}
