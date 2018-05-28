package pl.ttpsc.decorator;

public class ParkingAssistance extends CarAccessory {

    public ParkingAssistance(Car car) {
        super(car);
    }

    @Override
    public double getWeight() {
        return car.getWeight();
    }

}
