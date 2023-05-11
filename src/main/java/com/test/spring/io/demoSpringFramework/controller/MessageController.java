package com.test.spring.io.demoSpringFramework.controller;

import com.test.spring.io.demoSpringFramework.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MessageController {
    private List<Message> messageList = new ArrayList<>();

    @GetMapping("/msg")
    public String showMessage(Model model) {
        Message msg1 = new Message("David", "Bonjour tout le monde");
        Message msg2 = new Message("Toto", "J'aime les glaces");

        messageList.add(msg1);
        messageList.add(msg2);

        model.addAttribute("msglist", messageList);

        return "MessagePage";
    }
}
