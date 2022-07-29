package Part2.section1.ch11;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
this.busNumber=busNumber;
    }

    public void take(int money)
    {
        this.money+=money;
    passengerCount+=1;
    }

    public void showBusInfo()
    {
        System.out.println("번스번호: "+busNumber+" 승객수 : "+passengerCount+" 수입: "+money);
    }


}
