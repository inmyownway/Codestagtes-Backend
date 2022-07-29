package Part2.section2.ch10;

public class testCar {
    public static void main(String[] args)
    {
        Car car = new AICar();
        car.run();

        Car mcar = new ManualCar();
        mcar.run();
    }
}
