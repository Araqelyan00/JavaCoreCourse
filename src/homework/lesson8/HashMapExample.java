package homework.lesson8;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

//        No attribute constructor
//        Map<String, String> map = new HashMap<>();


//        Constructor with initial capacity and load factory.
//        These attributes are default values. (0.75f is a golden middle choose for it.)
        Map<String, Student> map = new HashMap<>(16,0.75f);

        Student student1 = new Student(1,"Ashot", 1);
        Student student2 = new Student(2,"Vardan", 2);
        Student student3 = new Student(3,"Mariam", 4);
        Student student4 = new Student(4,"Sam", 5);

        map.put(student1.getName(), student1);
        map.put(student2.getName(), student2);
        map.put(student3.getName(), student3);
        map.put(student4.getName(), student4);
        System.out.println(map);
        System.out.println(map.get(student1.getName()));
    }
}
