package Part2.section1.ch19;

public class CarFactorytest {
    public static void main(String[] args)
    {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());
    }
}
