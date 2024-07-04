package classwork.lesson1;

import classwork.lesson1_2.Employee;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee e = new Employee(1);

        String s = e.surname = "Valod";

        System.out.println("ID:  ," + " Surname: " + s);
    }
}
