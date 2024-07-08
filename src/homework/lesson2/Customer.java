package homework.lesson2;

public class Customer extends Human{
    String name;
    int age;
    public Customer(String name){
        super("Name", "Surname", true, 18, 1);
        this.name = name;
    }
    @Override
    public void speak() {
        System.out.println("I am a customer and my name is " + this.name);
    }

    @Override
    public void walk() {

    }

    @Override
    public void logic() {

    }

    @Override
    public void power() {

    }
}
