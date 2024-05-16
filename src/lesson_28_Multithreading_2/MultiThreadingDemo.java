package lesson_28_Multithreading_2;

public class MultiThreadingDemo extends Thread{
    public void run()
    {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
            Thread.sleep(100);
        }catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
