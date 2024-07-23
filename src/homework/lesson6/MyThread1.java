package homework.lesson6;

public class MyThread1 extends Thread {
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println(i);
        }
        System.out.println("MyThread1 end");
    }
}
