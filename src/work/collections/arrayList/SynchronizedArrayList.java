package work.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayList implements Runnable {

    private List<Integer> synchList;

    public SynchronizedArrayList(List<Integer> synchList) {
        this.synchList = synchList;
    }

    public static void main(String[] args) {

        List<Integer> theadSafeList = Collections.synchronizedList(new ArrayList<>());
        Thread thread1 = new Thread(new SynchronizedArrayList(theadSafeList));
        Thread thread2 = new Thread(new SynchronizedArrayList(theadSafeList));
        Thread thread3 = new Thread(new SynchronizedArrayList(theadSafeList));

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
        for (int i : theadSafeList) {
            System.out.println(i);
        }
        System.out.println("size of list: " + theadSafeList.size());

    }

    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {
            synchList.add(i);
        }

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
