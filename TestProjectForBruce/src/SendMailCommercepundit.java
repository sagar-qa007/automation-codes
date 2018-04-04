import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailCommercepundit {

    static String host;
	static String port;
	static String emailid;
	static String username;
	static String password;
    static Properties props = System.getProperties();
    static Session l_session = null;

    public static void SendMailCommercepundit() {
        host = "smtp.commercepundit.com";
        port = "587";
        emailid = "sagar.khalasi@commercepundit.com";
        username = "sagar.khalasi@commercepundit.com";
        password = "Pundit123";

        emailSettings();
        createSession();
        sendMessage("sagar.khalasi@commercepundit.com", "ankush@commercepundit.com","Test","test Mail");
    }

    public static void emailSettings() {
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "false");
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.user", username);
        props.put("mail.smtp.password", password);
       // props.put("mail.smtp.socketFactory.port", port);
       // props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
       // props.put("mail.smtp.socketFactory.fallback", "false");

    }

    public static void createSession() {

        l_session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        l_session.setDebug(true); // Enable the debug mode

    }

    public static boolean sendMessage(String emailFromUser, String toEmail, String subject, String msg) {
        //System.out.println("Inside sendMessage 2 :: >> ");
        try {
            //System.out.println("Sending Message *********************************** ");
            MimeMessage message = new MimeMessage(l_session);
            emailid = emailFromUser;
            //System.out.println("mail id in property ============= >>>>>>>>>>>>>> " + emailid);
            //message.setFrom(new InternetAddress(emailid));
            message.setFrom(new InternetAddress(emailid));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
           // message.addRecipient(Message.RecipientType.BCC, new InternetAddress("sagar.khalasi@commercepundit.com"));
            message.setSubject(subject);
            message.setContent(msg, "text/html");

            //message.setText(msg);
            Transport.send(message);
            System.out.println("Message Sent");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }//end catch block
        return true;
    }

}