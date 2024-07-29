package homework.lesson8.list_interface;

import homework.lesson8.Student;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

//Create new ArrayList
    //1.Version
//    ArrayList list = new ArrayList();
    //2.Version(adding attribute minimal capacity 100)
    ArrayList<Student> newList = new ArrayList(100);
    //3.Version
        List<Student> list = new ArrayList<>();

//Create objects of Student class
        Student student1 = new Student(1,"Ashot", 1);
        Student student2 = new Student(2,"Vardan", 2);
        Student student3 = new Student(3,"Mariam", 4);
        Student student4 = new Student(4,"Sam", 5);
        Student student5 = new Student(5,"Lilit", 2);

//Add students to the list
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        System.out.println(list);
//Add a student to index 1
        list.add(1,student5);
        System.out.println(list);

//Get and print student's information
        System.out.println(list.get(0).toString());
//Set student 6 to index 4
        Student student6 = new Student(6,"Gor",4);
        list.set(4,student6);
        System.out.println(list);
//Remove student by Obj & by index
        list.remove(student6);
        list.remove(0);
        System.out.println(list);

        Student student7 = new Student(7,"Tigran",4);
        Student student8 = new Student(8,"Karen",1);
        Student student9 = new Student(9,"Nare",3);
        Student student0 = new Student(0,"Luiza",2);
        newList.add(student0);
        newList.add(student7);
        newList.add(student8);
        newList.add(student9);

//Add another ArrayList to our ArrayList(We can put the attribute index, and adding will be done from that index)
        list.addAll(newList);
        System.out.println(list);

//Print list's size
        System.out.println(list.size());

//Delete all elements of list
        newList.clear();

//Check if the list is empty
        if (newList.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List is not empty");
        }

        if (list.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List is not empty");
        }

    }
}
