package Part2.section1.ch11;

public class trans {
    public static void main(String[] args) {
        Student tom = new Student("tom", 10000);
        Student jason = new Student("jason", 5000);

        Bus bus100 = new Bus(100);
        Subway green = new Subway(7);
        tom.takeBus(bus100);
        tom.showInfo();
        bus100.showBusInfo();
    }
}
