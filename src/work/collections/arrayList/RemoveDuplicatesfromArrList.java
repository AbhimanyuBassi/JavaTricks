package work.collections.arrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesfromArrList {

    public ArrayList<Integer> removeDuplicate(ArrayList arrayList) {
        Set<Integer> withoutDuplicateSet = new LinkedHashSet<Integer>(arrayList);
        // now let's clear the ArrayList so that we can
        // copy all elements from LinkedHashSet
        arrayList.clear();
        arrayList.addAll(withoutDuplicateSet);
        return arrayList;
    }

}
