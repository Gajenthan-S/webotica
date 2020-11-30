/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import javax.mail.*;
import javax.activation.*;
import javax.mail.internet.*;

/**
 *
 * @author KD1999
 */
public class sendEmail {
    public void send (String Emailaddress, String partname) throws AddressException, MessagingException {
 
  final String user="kdk52122@gmail.com"; 
  final String password="kd@123456789#";
 
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        
        

        Session session = Session.getDefaultInstance(props,
        new javax.mail.Authenticator() {

                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(user, password);
                    }
                });
  
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(Emailaddress));
            message.setSubject("Low Stock Notification");
            message.setText(partname+" "+"Stocks are running low and need new stock soon .");



            Transport.send(message);
            System.out.println("sent");
    }
        catch (MessagingException e) {
            throw new RuntimeException(e);
        }
}
  
}

