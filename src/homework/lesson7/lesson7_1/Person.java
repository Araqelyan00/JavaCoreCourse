package homework.lesson7.lesson7_1;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -631622909235584360L;
    //The 'serialVersionUID = -631622909235584360L' is a unique ID of this class. If we change this class we need to regenerate this id.
    //If we don't need to serialize any property we can type after word private a key word transient.
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}
