
package Part2.section2.ch2;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }

    public Customer()
    {
        customerGrade="silver";
        bonusRatio=0.01;

    }
    public int calPrice(int price)
    {
        bonusPoint+=price*bonusRatio;
        return price;
    }
    public String ShowCustomerInfo()
    {
        return customerName+"의 등급은 "+customerGrade+" 보너스 포인트는 "+bonusPoint;
    }



}
