package homework.lesson1_2;

public class Circle {
    static final double PI = 3.14;

    double area(double radius) {
        double area = PI * radius * radius;
        return area;
    }
    static double square(double radius) {
        double square = 2 * PI * radius;
        return square;
    }
    void info(double radius){
        System.out.println("Radius is :" + radius);
        System.out.println("Area is :" + area(radius));
        System.out.println("Square is :" + square(radius));
    }
}
