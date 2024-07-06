package homework.lesson1_2;

public class StaticMethods {

    static int method1(int a, int b, int c) {
        int l = a * b * c;
        return l;
    }

    static void method2(int a, int b) {
        int l = a / b;
        int j = a % b;
        System.out.println("Method 2 Result :" + l + " and " + j);
    }
}
