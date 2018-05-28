package pl.ttpsc.decorator;

public class CarAccessory implements Car {

    protected Car car;

    public CarAccessory(Car car) {
        this.car = car;
    }

    @Override
    public double getWeight() {
        return car.getWeight();
    }
}
