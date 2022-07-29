package Part2.section1.ch19;

public class CarFactory {
    private static CarFactory instacne = new CarFactory();
    CarFactory(){};

    public static CarFactory getInstance()
    {
        if(instacne== null) {
            instacne = new CarFactory();
        }
        return instacne;

    }

    public Car createCar()
    {
        Car car = new Car();
        return car;
    }


}
