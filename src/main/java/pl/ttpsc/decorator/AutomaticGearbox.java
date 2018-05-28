package pl.ttpsc.decorator;

public class AutomaticGearbox extends CarAccessory {

    public AutomaticGearbox(Car car) {
        super(car);
    }

    @Override
    public double getWeight() {
        return car.getWeight() + 100;
    }

}
