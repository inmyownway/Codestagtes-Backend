package Part2.section2.ch15;

public class testCustomer {

    public static void main(String[] args)
    {
        Customer customer =new Customer();
        customer.buy();
        customer.order();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();
    }
}
