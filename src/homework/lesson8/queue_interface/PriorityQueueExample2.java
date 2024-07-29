package homework.lesson8.queue_interface;

import homework.lesson8.Student;

import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
//      Class Student will implement Comparable interface. Otherwise, the program will throw exception.
        Student student6 = new Student(6,"Gor",4);
        Student student1 = new Student(1,"Ashot", 1);
        Student student2 = new Student(2,"Vardan", 2);
        Student student3 = new Student(3,"Mariam", 4);
        Student student4 = new Student(4,"Sam", 5);
        Student student5 = new Student(5,"Lilit", 2);
        Student student7 = new Student(7,"Tigran",4);
        Student student8 = new Student(8,"Karen",1);
        Student student9 = new Student(9,"Nare",3);
        Student student0 = new Student(0,"Luiza",2);
        pq.add(student7);
        pq.add(student8);
        pq.add(student9);
        pq.add(student0);
        pq.add(student1);
        pq.add(student2);
        pq.add(student3);
        pq.add(student4);
        pq.add(student5);
        pq.add(student6);

        System.out.println(pq);
    }
}
