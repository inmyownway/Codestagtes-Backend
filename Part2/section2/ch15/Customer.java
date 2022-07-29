package Part2.section2.ch15;


public class Customer implements Buy,Sell {


    @Override
    public void buy() {
        System.out.println("custoer buy");
    }

    @Override
    public void Sell() {
        System.out.println("custoer sell");
    }

    @Override
    public void order() {

        System.out.println("customer order");
    }
    public void hello(){
        System.out.println("customer hello");
    }
}
