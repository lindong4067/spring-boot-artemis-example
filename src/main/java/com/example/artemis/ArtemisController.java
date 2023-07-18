package com.example.artemis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtemisController {
    @Autowired
    MessageSender messageSender;

    @PostMapping("/send")
    public String send(String msg) {
        messageSender.sendMessage("my-queue-1", msg);
        return "Send message: " + msg;
    }
}
