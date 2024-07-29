package homework.lesson8.map_interface;

import homework.lesson8.Student;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String, Student> students = new Hashtable<>();

        Student student1 = new Student(1,"Ashot", 1);
        Student student2 = new Student(2,"Vardan", 2);
        Student student3 = new Student(3,"Mariam", 4);
        Student student4 = new Student(4,"Sam", 5);
        Student student5 = new Student(5,"Lilit", 2);

        students.put(student1.getName(), student1);
        students.put(student2.getName(), student2);
        students.put(student3.getName(), student3);
        students.put(student4.getName(), student4);
        students.put(student5.getName(), student5);

        System.out.println(students);
        System.out.println(students.size());

        students.remove("Ashot");
        System.out.println(students);

        System.out.println(students.containsKey("Lilit"));
        System.out.println(students.contains(student1));

        students.clear();
    }
}
