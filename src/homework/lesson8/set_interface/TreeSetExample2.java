package homework.lesson8.set_interface;

import homework.lesson8.Student;

import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
//        The type we use in TreeSet will be comparable. That means we will use or already comparable class
//        || we will make our class comparable using Interface Comparable and Override method compareTo():
//        Our Student class implements Comparable, and the method compareTo() is Overridden.
//        That's why we can use it here without any problems.
        TreeSet<Student> ts = new TreeSet<>();
        Student student1 = new Student(1,"Ashot", 1);
        Student student2 = new Student(2,"Vardan", 2);
        Student student3 = new Student(3,"Mariam", 4);
        Student student4 = new Student(4,"Sam", 5);
        Student student5 = new Student(5,"Lilit", 2);
        Student student6 = new Student(0,"Sara", 2);
        Student student7 = new Student(0,"Sara", 2);

        ts.add(student5);
        ts.add(student1);
        ts.add(student3);
        ts.add(student2);
        ts.add(student4);

        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.headSet(student6));
        System.out.println(ts.tailSet(student6));
        System.out.println(ts.subSet(student2, student5));
        System.out.println(student6.equals(student7));
        System.out.println(student6.hashCode() == student7.hashCode());

    }
}
