package com.example.Mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mail.model.EmailModel;
import com.example.Mail.service.EmailService;

@RestController
@RequestMapping("/email")
@CrossOrigin
public class EmailController {

    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public String postMail(@RequestBody EmailModel emailModel) {
        emailService.sendSimpleMessage(emailModel.getTo(), emailModel.getSubject(), emailModel.getText());
        return "Email sent successfully";
    }
}
