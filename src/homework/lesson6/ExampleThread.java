package homework.lesson6;

public class ExampleThread {
    public static void main(String[] args){
//        MyThread1 myThread1 = new MyThread1();
//        MyThread2 myThread2 = new MyThread2();
        Thread myThread = new Thread(new MyThread3());
        myThread.setName("First Thread");
        System.out.println(myThread.getName() + " " + myThread.getState());

        myThread.start();
        System.out.println(myThread.getName() + " " + myThread.getState());
//        myThread1.start();
//        System.out.println("My Thread 1 is :" + myThread1.getState());
//        myThread2.start();
//        System.out.println("My Thread 2 is :" + myThread2.getState());
    }
}
