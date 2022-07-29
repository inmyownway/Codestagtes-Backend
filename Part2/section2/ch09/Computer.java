package Part2.section2.ch09;

public abstract class Computer {
    public abstract void display();
    public abstract void typing();
    public void turnOn()
    {
        System.out.println("전원 On");
    }
    public void turnOff()
    {
        System.out.println("전원 off");
    }
}
