package hello;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage1(String email) {
        System.out.println("Received <" + email + ">");
        System.out.println("topic1");
    }

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage2(String email) {
        System.out.println("Received <" + email + ">");
        System.out.println("topic2");
    }

    @JmsListener(destination = "mailbox", containerFactory = "myFactory2")
    public void receiveMessage3(String email) {
        System.out.println("Received <" + email + ">");
        System.out.println("queue");
    }

}
