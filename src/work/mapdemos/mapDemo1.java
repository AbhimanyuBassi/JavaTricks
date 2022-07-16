package work.mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapDemo1 {


    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus", "cycle", "train", "tram");
        List<String> upperNameVehicles = new ArrayList<String>();

        //without streams
        for (String elements : vehicles) {
            System.out.println(elements.toUpperCase());
            //upperNameVehicles.add(elements);
        }

        //streams
        upperNameVehicles = vehicles.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperNameVehicles);

    }
}
