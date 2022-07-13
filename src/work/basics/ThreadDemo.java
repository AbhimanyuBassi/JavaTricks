package work.basics;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        //Thread
       new Thread(()-> System.out.println("Thread1 Lambda")).start();


       Thread.sleep(2000);
        //public Runnable
        new Thread(()->System.out.println("Thread2 Lambda")).start();

    }
}


