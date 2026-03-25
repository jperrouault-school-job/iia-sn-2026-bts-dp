package fr.formation;

public class LogSubscriber implements Subscriber {
    @Override
    public void update(Publisher pub) {
        System.out.println("Journal après findAll !");
    }
}
