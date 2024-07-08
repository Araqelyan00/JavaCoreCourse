package homework.lesson2;

public abstract class Human {
    String name;
    String surname;
    boolean haveEducation;
    int age;
    int id;
    Human(String name, String surname, boolean haveEducation, int age, int id){
        this.name = name;
        this.surname = surname;
        this.haveEducation = haveEducation;
        this.age = age;
        this.id = id;
    }


    public abstract void speak();
    public abstract void walk();
    public abstract void logic();
    public abstract void power();

}
