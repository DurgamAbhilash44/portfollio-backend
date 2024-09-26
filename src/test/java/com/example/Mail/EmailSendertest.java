package com.example.Mail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Mail.service.EmailService;

@SpringBootTest
public class EmailSendertest {  // Corrected class name to follow CamelCase

    @Autowired
    private EmailService emailService;  // Renamed to follow standard naming conventions

    @Test
    void emailSendTest() {  // Corrected method name to follow standard naming conventions
        // Testing email sending functionality
        emailService.sendSimpleMessage("durgamabhilash798@gmail.com", "Test Email", "Hello, This is a test email");
    }
}
