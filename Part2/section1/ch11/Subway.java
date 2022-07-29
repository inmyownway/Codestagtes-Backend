package Part2.section1.ch11;

public class Subway {
    int subwayNumber;
    int passengerCount;
    int money;

    public Subway(int subwayNumber) {
        this.subwayNumber=subwayNumber;
    }

    public void take(int money)
    {
        this.money+=money;
        passengerCount+=1;
    }

    public void showsubwayInfo()
    {
        System.out.println("지하철번호: "+subwayNumber+" 승객수 : "+passengerCount+" 수입: "+money);
    }
}
