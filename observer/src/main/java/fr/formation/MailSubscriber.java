package fr.formation;

public class MailSubscriber implements Subscriber {
    @Override
    public void update(Publisher pub) {
        System.out.println("Mail après findAll !");
    }
}
