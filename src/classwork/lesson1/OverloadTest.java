package classwork.lesson1;

public class OverloadTest {
    void test(){
        System.out.println("I em Test");
    }
    void test(int a){
        System.out.println("I em Test" + a);
    }
    void test(String a){
        System.out.println("I em Test" + a);
    }
}
