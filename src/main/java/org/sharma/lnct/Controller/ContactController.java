package org.sharma.lnct.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
    @Autowired
    public JavaMailSender mailSender;
    @PostMapping("/mail")
    public String sendContactMail(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String subject,
            @RequestParam String message
    ){
        SimpleMailMessage MailMessage = new SimpleMailMessage();

        MailMessage.setTo("shivamsharmacet@gmail.com");
        MailMessage.setSubject(subject);
        MailMessage.setText("Name: " + name + "\nEmail: " + email + "\nMessage: " + message);

        mailSender.send(MailMessage);

        return "redirect:/contactus?success";
    }
}
