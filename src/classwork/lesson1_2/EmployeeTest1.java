package classwork.lesson1_2;

public class EmployeeTest1 {
    public static void main(String[] args) {
        Employee e = new Employee(12);
        int i;
        i = e.id;
        String s = e.surname = "Valod";
        System.out.println("ID: " + i + " Surname: " + s);
    }
}
