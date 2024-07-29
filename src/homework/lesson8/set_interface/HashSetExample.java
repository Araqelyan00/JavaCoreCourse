package homework.lesson8.set_interface;

import homework.lesson8.Student;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> hashset = new HashSet<>();

        Student student1 = new Student(1,"Ashot", 1);
        Student student2 = new Student(2,"Vardan", 2);
        Student student3 = new Student(3,"Mariam", 4);
        Student student4 = new Student(4,"Sam", 5);
        Student student5 = new Student(5,"Lilit", 2);

        hashset.add(student4);
        hashset.add(student2);
        hashset.add(student5);
        hashset.add(student3);
        hashset.add(student1);
        hashset.add(null);

        System.out.println(hashset);

        hashset.remove(null);
        System.out.println(hashset);
        System.out.println(hashset.isEmpty());
        System.out.println(hashset.size());
        System.out.println(hashset.contains(student1));
    }
}
