package codestates.IInterface;



interface Customer{

    String getOrder();

}
 class CafeCustomerA implements Customer{
public String getOrder()
{
    return "americano";
}
}
 class CafeCustomerB implements Customer{
    public String getOrder()
    {
        return "latee";
    }
}
class CafeOwner{
public void giveItem(Customer customer){
    System.out.println("item:" + customer.getOrder());
}
}
class OrderExample {
    public static void main(String[] args) throws Exception
    {
        CafeOwner cafeowner = new CafeOwner();
        Customer a = new CafeCustomerA();
        Customer b = new CafeCustomerB();

        cafeowner.giveItem(a);

        cafeowner.giveItem(b);

    }
}
