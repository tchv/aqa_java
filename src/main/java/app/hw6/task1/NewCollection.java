package app.hw6.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class NewCollection {
    static void newCollection() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int min = -5;
        int max = 25;

        for (int i = min; i <= max; i++) {
            list.add(i);
        }

        List<Integer> newList = list.stream().filter(i -> i >= 5).sorted().collect(Collectors.toList());
        System.out.println(newList);
    }
}
