package com.hello.notification.service;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;



@Service
public class NotificationService {
    private final MailSender mailSender;

    public NotificationService(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMailMessage(final SimpleMailMessage simpleMailMessage){
        this.mailSender.send(simpleMailMessage);

    }

}
