package pl.ttpsc.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableSource {

    private List<Observer> observers = new ArrayList<>();
    private String message;

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    public void subcribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubcribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(o -> o.update(message));
    }

}
