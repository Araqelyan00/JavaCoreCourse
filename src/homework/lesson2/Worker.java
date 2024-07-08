package homework.lesson2;

public class Worker extends Human{
    int id;
    String name;
    String surname;
    boolean haveEducation;
    int age;

    Worker(int age, String name, String surname, boolean haveEducation) {
        super("Name", "Surname", true, 18, 1);
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.haveEducation = haveEducation;
    }
    Worker(int age, String name, String surname, boolean haveEducation, int id){
        super("Name", "Surname", true, 18, 1);
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.haveEducation = haveEducation;
        this.id = id;
    }

    @Override
    public void speak() {
        if(this.id >= super.id)System.out.println("I am a worker and my name is " + this.name);
        else System.out.println("I am not a worker");
    }

    @Override
    public void walk() {
        System.out.println("I can walk");

    }

    @Override
    public void logic() {
        if (!this.haveEducation) System.out.println("I don't have a logical mind");
        else System.out.println("I have a logical mind");

    }

    @Override
    public void power() {
        if (this.age >= super.age) System.out.println("I'm powerful");
        else System.out.println("I'm not powerful");

    }
}
