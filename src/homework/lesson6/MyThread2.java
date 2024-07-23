package homework.lesson6;

public class MyThread2 extends Thread {
    @Override
    public void run(){
        for (int i = 1000; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("MyThread2 end");
    }
}
