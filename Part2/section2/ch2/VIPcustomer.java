
package Part2.section2.ch2;

public class VIPcustomer extends Customer{


    private String AgentID;
    double saleRatio;

    public String getAgentID() {
        return AgentID;
    }

    public void setAgentID(String agentID) {
        AgentID = agentID;
    }

    public double getSaleRatio() {
        return saleRatio;
    }

    public void setSaleRatio(double saleRatio) {
        this.saleRatio = saleRatio;
    }

    public VIPcustomer()
    {
        customerGrade= "VIP";
        bonusRatio=0.05;
        saleRatio=0.1;
    }
    public int calPrice(int price)
    {
        bonusPoint+=price*bonusRatio;
        return price;
    }
    public String ShowCustomerInfo()
    {
        return customerName + "의 등급은 " + customerGrade + " 보너스 포인트는 " + bonusPoint;
    }

}

