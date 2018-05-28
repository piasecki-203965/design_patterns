package pl.ttpsc.observer;

public class TVN24 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("TVN24: " + message);
    }
}
