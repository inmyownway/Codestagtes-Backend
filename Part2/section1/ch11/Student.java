package Part2.section1.ch11;

public class Student {
    String studnetName;
    int money;

    public Student(String studnetName, int money) {
        this.studnetName = studnetName;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money-=1000;
    }
    public void takeSubway(Subway subway)
    {
        subway.take(1200);
        this.money-=1200;
    }
    public void showInfo()
    {
        System.out.println("남은돈은 "+ money);
    }
}
