package homework.lesson8;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
//        We can use accessOrder: true for saving information about last used element
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(16, 0.75f, false);

        Student student1 = new Student(1,"Ashot", 1);
        Student student2 = new Student(2,"Vardan", 2);
        Student student3 = new Student(3,"Mariam", 4);
        Student student4 = new Student(4,"Sam", 5);

        map.put(student1.getId(), student1.getName());
        map.put(student2.getId(), student2.getName());
        map.put(student3.getId(), student3.getName());
        map.put(student4.getId(), student4.getName());
        System.out.println(map);

        System.out.println(map.get(student1.getId()));
        System.out.println(map);
    }
}
