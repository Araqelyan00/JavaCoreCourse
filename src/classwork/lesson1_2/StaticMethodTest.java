package classwork.lesson1_2;

public class StaticMethodTest {
    public static void main(String[] args) {
        StaticMethods sM1 = new StaticMethods();
        System.out.println("Method 1 result :" + sM1.method1(2,3,4));
        sM1.method2(10,7);

        StaticMethods sM2 = new StaticMethods();
        System.out.println("Method 1 result :" + sM2.method1(15,9,5));
        sM2.method2(31,3);
    }
}
