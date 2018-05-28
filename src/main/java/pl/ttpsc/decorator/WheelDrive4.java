package pl.ttpsc.decorator;

public class WheelDrive4 extends CarAccessory {

    public WheelDrive4(Car car) {
        super(car);
    }

    @Override
    public double getWeight() {
        return car.getWeight() + 500;
    }
}
