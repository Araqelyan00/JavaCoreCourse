package homework.lesson7.lesson7_1;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1,"Bob");
        Person person2 = new Person(2,"Alice");
        Person[] people = {new Person(3,"Sara"), new Person(4,"Mike"), new Person(5,"Sam")};

        try {
            FileOutputStream fos = new FileOutputStream("src/homework/lesson7/lesson7_1/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.writeObject(people);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
