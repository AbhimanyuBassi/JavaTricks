package work.streams.capgemini;

import work.maxSalaryEachDept.EmployeeDetails;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class PlayerDriver {

    public static void main(String[] args) {

        Player p1 = new Player("Abhi", "Bowler", 30);
        Player p2 = new Player("Sachin", "Batsman", 100);
        Player p3 = new Player("Dhoni", "WicketKeeper", 75);
        Player p4 = new Player("Virat", "Batsman", 80);
        Player p5 = new Player("Sehwag", "WicketKeeper", 120);
        Player p6 = new Player("Zaheer", "Bowler", 20);

        List<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);

        //Get Team Score
        Integer totalScore = players.stream().mapToInt(x -> x.getScore()).sum();
        System.out.println(totalScore);

        //GroupBy the skillset
        Map<Object, List<Player>> playerType = players.stream().collect(Collectors.groupingBy(player -> player.getType()));
        System.out.println(playerType);

        //Get the total number of Skillset players
        Map<String, Long> playersSkillsetWise = players.stream().collect(Collectors.groupingBy(player -> player.getType(), Collectors.counting()));
        System.out.println(playersSkillsetWise);

        //Get the max score
        Object maxScore = players.stream()
                .collect(collectingAndThen(maxBy(Comparator.comparingInt(p -> p.getScore())), Optional::get));
        System.out.println(maxScore);
    }
}
