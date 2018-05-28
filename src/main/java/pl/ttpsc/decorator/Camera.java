package pl.ttpsc.decorator;

public class Camera extends CarAccessory {

    public Camera(Car car) {
        super(car);
    }

    @Override
    public double getWeight() {
        return car.getWeight() + 10;
    }
}
