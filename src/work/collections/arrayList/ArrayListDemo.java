package work.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    static ArrayList<Integer> integerArrayList = new ArrayList<>();

    public static void main(String[] args) {

        integerArrayList.add(12);
        integerArrayList.add(23);
        integerArrayList.add(5);
        integerArrayList.add(0);
        integerArrayList.add(297);
        integerArrayList.add(76);
        integerArrayList.add(0);
        integerArrayList.add(1);
        integerArrayList.add(88);
        integerArrayList.add(32);
        integerArrayList.add(25);
        integerArrayList.add(0);
        integerArrayList.add(1);
        integerArrayList.add(88);
        integerArrayList.add(32);
        integerArrayList.add(25);

        System.out.println("size of ArrayList " + integerArrayList.size());
        System.out.println("Print the Array list: ");
        System.out.println(integerArrayList);

        //Reverse the ArrayList
        System.out.println("Reversing the ArrayList :");
        Collections.reverse(integerArrayList);
        System.out.println(integerArrayList);

        //Printing each element of the arraylist
        System.out.println("Printing each element of the Arraylist using for each");
        for (int i : integerArrayList) {
            System.out.println(i);
        }

        integerArrayList.add(55);
        System.out.println(integerArrayList);


        final ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(integerArrayList);

        System.out.println(arrayList);


        //arrayList = new ArrayList<>(); Compiler error saying make the arraylist not final
        //It gives compilation error because we are reassigning the arrayList using new keyword

        //Remove duplicate from the ArrayList
        //Since the List interface allows duplicates, ArrayList also allowed it but if you
        // remember Set interface doesn't allow duplicates, which means you can remove duplicates
        // from ArrayList by converting it into a Set and then back to ArrayList

        RemoveDuplicatesfromArrList obj = new RemoveDuplicatesfromArrList();
        ArrayList<Integer> listWithoutDuplicates = obj.removeDuplicate(integerArrayList);
        System.out.println(listWithoutDuplicates);
    }
}
