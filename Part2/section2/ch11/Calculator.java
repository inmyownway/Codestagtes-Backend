package Part2.section2.ch11;

public abstract class Calculator implements Calc{
    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1-num2;
    }

}
