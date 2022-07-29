package codestates.aabstract;

abstract class Animal
{
    public String kind;
    public abstract void sound();

}
class Dog extends Animal{
    public Dog(){
        this.kind= "포유류";
    }
    public void sound()
    {
        System.out.println("멍멍");
    }
}
class Cat extends Animal{
    public Cat(){
        this.kind="포유류";
    }
    public void sound()
    {
        System.out.println("야옹");
    }
}
public class DogExample {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(dog.kind);
        dog.sound();
        System.out.println(cat.kind);
        cat.sound();
    }
}
