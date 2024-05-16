package lesson_31_RDBMS.practice;

public class MyThreadApp {
    public static void main(String[] args) {
        Thread myThread = new Thread("Zeka");

        myThread.start();

        new Thread(() -> System.out.println("Thread name: " + Thread.currentThread().getName())).start();
    }

    public static class myThread extends Thread{

        public myThread(String name){
            super(name);
        }

//        @Override
//        public void run(){
//            for (int i = 0; i < 3; i++) {
//                System.out.println("Thread ad: " + Thread.currentThread().getName());
//            }
//        }
    }
}
