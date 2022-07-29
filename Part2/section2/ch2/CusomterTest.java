package Part2.section2.ch2;

public class CusomterTest {
    public static void main(String[] args)
    {
        Customer customer = new Customer();
        customer.setCustomerName("정민");
        customer.setCustomerID(1101);
        customer.bonusPoint=1000;
        System.out.println(customer.ShowCustomerInfo());

        VIPcustomer kim = new VIPcustomer();
        kim.setCustomerName("kim");
        kim.setCustomerID(1111);
        kim.setBonusPoint(1000);
        System.out.println(kim.ShowCustomerInfo());
    }
}
