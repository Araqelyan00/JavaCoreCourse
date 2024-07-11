package classwork.lesson4;

import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) {
        String s = "123";


        try {
            int a = Integer.parseInt("123D");
            System.out.println(a * 2);
        } catch (NumberFormatException e) {
            System.out.println("Pleace input only numbers!");
        }
        System.out.println("Hello World!");

    String email = "test@gmail.com";

    try{
        chackEmail(email);
        System.out.println("Email is correct");
    }
    catch(IOException e){
        System.out.println("Wrong email address");
    }
        System.out.println("End of program!");
}
        static void chackEmail(String email) throws IOException {
            if (!email.contains("@")) {throw new IOException();}

            System.out.println("Sending email");
        }
}