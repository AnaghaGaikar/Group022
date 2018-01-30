package dao;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import dto.MailDto;

public class MailDao {
public int sendMail(MailDto mail) {
		
		int i=0;
		String to=mail.getRecipientEmail().toString();
		String subject=mail.getSubject().toString();
		String content=mail.getContent().toString();
		final String from = "infomedical3255@gmail.com";
		final String password = "shashankmr3255";
		
	
		
		try {
		Properties prop = System.getProperties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.socketFactory.port", "587");
		prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		prop.put("mail.smtp.auth", "true"); 
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.user", from);
        prop.put("mail.password", password);
		
        //prop.setProperty("mail.smtp.host", host);
		
        Authenticator auth = new Authenticator()
        {
            public PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(from, password);
            }
        };
        
		Session session = Session.getDefaultInstance(prop, auth);
		
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			InternetAddress[] iAdressArray = InternetAddress.parse(to);
			msg.setRecipients(Message.RecipientType.CC, iAdressArray);
			msg.setSubject(subject);
			msg.setText(content);
			Transport.send(msg);
		
		}catch (MessagingException e) {
			e.printStackTrace();
		}
		return i;
	}
}
