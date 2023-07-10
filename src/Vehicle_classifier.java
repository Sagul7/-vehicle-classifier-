abstract class Vehicle {
 abstract void start();
 abstract void stop();
}
class Car extends Vehicle
{
    @Override
    void start() {
        System.out.println("Car Started");
    }
    @Override
    void stop() {
        System.out.println("Car Stoped");
    }
}
class MotorCycle extends Car
{
    @Override
    void start() {
        System.out.println("MotorCycle Started");
    }
    @Override
    void stop() {
        System.out.println("MotorCycle Stoped");
    }
}
public class Vehicle_classifier {
    public static void main(String[] args) {
        MotorCycle motorcycle =new MotorCycle();
        motorcycle.start();
        motorcycle.stop();
        Car car=new Car();
        car.start();
        car.stop();
    }
}
