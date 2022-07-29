package codestates;

public class PolymorphismEx {
    public static void main(String[] args)
    {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano());
        customer.buyCoffee(new CaffeLatte());
    }
}

class Coffee{
    int price;
    public Coffee(int price){

        this.price= price;
    }
}
class Americano extends Coffee{
    public Americano()
    {
        super(4000);
    }
    public String toString(){return "아메리카노";}

}
class CaffeLatte extends Coffee
{
    public CaffeLatte()
    {super(4500);}
    public String toString(){return "카페라떼";}

}
class Customer{
    int money =50000;
    void buyCoffee(Coffee coffee)
    {
        if(money < coffee.price)
        {
            System.out.println("잔고부족");

        }
        else
        {
            money-=coffee.price;
            System.out.println(coffee +"구매완료");
            System.out.println("남은잔고: "+money);
        }
    }
}