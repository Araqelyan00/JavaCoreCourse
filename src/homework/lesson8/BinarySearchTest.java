package homework.lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        Student student7 = new Student(7,"Tigran",4);
        Student student8 = new Student(8,"Karen",1);
        Student student9 = new Student(9,"Nare",3);
        Student student0 = new Student(0,"Luiza",2);
        Student student1 = new Student(1,"Ashot", 1);
        Student student2 = new Student(2,"Vardan", 2);
        Student student3 = new Student(3,"Mariam", 4);
        Student student4 = new Student(4,"Sam", 5);
        Student student5 = new Student(5,"Lilit", 2);
        Student student6 = new Student(6,"Gor",4);

        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student0);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        System.out.println(list);

// Sort our list
        Collections.sort(list);
        System.out.println(list);
//Binary search
        int index = Collections.binarySearch(list, new Student(4,"Sam", 5));
        System.out.println(index);
    }
}
