package work.collections.arrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {

        List<Integer> numberList;
        List<String> stringArrayList;

        numberList = Arrays.asList(1, 2, 7, 87, 0, 9, 65, 29, 6, 11);
        stringArrayList = Arrays.asList("John", "Webb", "Abhi", "Sam", "Shawn");


        System.out.println("Sorting the list using Collections.sort");
        Collections.sort(numberList);
        Collections.sort(stringArrayList);

        System.out.println(numberList);
        System.out.println(stringArrayList);

        System.out.println("Reverse Sorting the list using Collections.sort");
        Collections.sort(numberList, Collections.reverseOrder());
        Collections.sort(stringArrayList, Collections.reverseOrder());

        System.out.println(numberList);
        System.out.println(stringArrayList);

    }
}
