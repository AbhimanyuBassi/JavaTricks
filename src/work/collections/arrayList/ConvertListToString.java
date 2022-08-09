package work.collections.arrayList;

import java.util.Arrays;
import java.util.List;

public class ConvertListToString {

    public static void main(String[] args) {
        List<String> stringArrayList;
        stringArrayList = Arrays.asList("John", "Webb", "Abhi", "Sam", "Shawn");

        StringBuilder sb = new StringBuilder();
        for (String str : stringArrayList
        ) {
            sb.append(str).append(";");
        }
        System.out.println(sb);
    }
}
