package classwork.lesson1_2;

public class Employee {
    protected int id;
    public String surname;
    private double salary;

    public void show(int a){
        System.out.println("Output is: " + id);
    }
    public void show(String a){
        System.out.println("Output is: " + surname);
    }
    public void show(double a){
        System.out.println("Output is: " + salary);
    }

    public Employee(int i){
        id = i;
    }
    Employee(int i, String s, double d){
        id = i;
        surname = s;
        salary = d;
    }
    private Employee(double d){
        salary = d;
    }

    public static void main(String[] args) {
        Employee e = new Employee(12);
        Employee e1 = new Employee(123.3);
        int i;
        i = e.id;
        String s = e.surname = "Valod";
        double d = e.salary = 123.4;

        System.out.println("ID: " + i + " Surname: " + s + " Salary: " + d);
    }
}
