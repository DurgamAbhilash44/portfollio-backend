package com.example.Mail.service;

public interface EmailService {
    void sendSimpleMessage(String to, String subject, String text);

    void sendSimpleMessage(String [] to ,String subject,String text);
    
}
