package Part2.section2.ch10;

public class AICar extends Car {
    @Override
    public void drive() {
        System.out.println("자율주행");

    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춤");
    }
}
