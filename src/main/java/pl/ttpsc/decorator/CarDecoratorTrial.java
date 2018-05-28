package pl.ttpsc.decorator;

public class CarDecoratorTrial {

    public static void main(String args[]) {

        Car car = new Combi();
        System.out.println("Car weight: " + Double.toString(car.getWeight()));
        Car carWithCamera = new Camera(car);
        System.out.println("Car weight with camera: " + Double.toString(carWithCamera.getWeight()));
        Car carWithCameraAndAutomaticGearbox = new AutomaticGearbox(carWithCamera);
        System.out.println("Car weight with camera and automatic gearbox: " + Double.toString(carWithCameraAndAutomaticGearbox.getWeight()));
    }

}
