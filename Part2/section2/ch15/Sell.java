package Part2.section2.ch15;

public interface Sell {
    void Sell();
    default void order()
    {
        System.out.println("sell order");
    }
}
