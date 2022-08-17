package com.hello.notification;

import com.hello.notification.service.NotificationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;

@SpringBootTest
class NotificationServiceTest {

    private final String email="abas.jaffari@gmail.com";
    @Autowired
    private NotificationService notificationService;

    @Test
    void testSendMail() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(email);
        simpleMailMessage.setTo(email);
        simpleMailMessage.setSubject("test subject");
        simpleMailMessage.setText("test text");

        notificationService.sendMailMessage(simpleMailMessage);
    }


}