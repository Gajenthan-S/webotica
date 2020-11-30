
import java.util.*;
import javax.mail.*;
import javax.activation.*;
import javax.mail.internet.*;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KD1999
 */
public class Sendmail {
     public void send2 (String Emailaddress, String jobno1) throws AddressException, MessagingException {
    
  final String user="kdk52122@gmail.com"; 
  final String password="kd@123456789#";  
 System.out.println(jobno1);
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.port", "465");
        
        
        

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
            message.setSubject("Job Status Notice");
            message.setText("Repair job of job no "+jobno1+" "+"is done and you can pick it up.");



            Transport.send(message);
            System.out.println("sent");
    }
        catch (MessagingException e) {
            throw new RuntimeException(e);
        }
}
    
    public void send3 (String Emailaddress, String jobno2) throws AddressException, MessagingException {
    
  final String user="kdk52122@gmail.com"; 
  final String password="kd@123456789#"; 
 System.out.println(jobno2);
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.port", "465");
        
        

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
            message.setSubject("Job Status Notice");
            message.setText("Restoration job of job no "+jobno2+" "+"is done and you can pick it up.");


            Transport.send(message);
            System.out.println("sent");
    }
        catch (MessagingException e) {
            throw new RuntimeException(e);
        }
}
}
