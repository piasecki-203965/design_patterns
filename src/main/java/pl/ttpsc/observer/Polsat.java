package pl.ttpsc.observer;

public class Polsat implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Polsat: " + message);
    }
}
