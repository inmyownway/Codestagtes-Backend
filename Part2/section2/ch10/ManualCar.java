package Part2.section2.ch10;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("메뉴얼 주행");
    }

    @Override
    public void stop() {

        System.out.println("메뉴얼 멈춤");

    }
}
