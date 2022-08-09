package work.collections.arrayList;

import java.util.ArrayList;

public class SynchProblemDemo implements Runnable {

    private ArrayList<Integer> numberList;

    public SynchProblemDemo(ArrayList<Integer> numberList) {
        this.numberList = numberList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> synchNumberList = new ArrayList<>();

        Thread thread1 = new Thread(new SynchProblemDemo(synchNumberList));
        Thread thread2 = new Thread(new SynchProblemDemo(synchNumberList));
        Thread thread3 = new Thread(new SynchProblemDemo(synchNumberList));

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Elements in the list");
        for (int i : synchNumberList) {
            System.out.println(i);
        }
        System.out.println("size of list: " + synchNumberList.size());
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            numberList.add(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
