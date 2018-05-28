package pl.ttpsc.observer;

public class TVP implements Observer {
    @Override
    public void update(String message) {
        System.out.println("TVP: " + message);
    }
}
