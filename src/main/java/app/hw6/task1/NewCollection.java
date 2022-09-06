package app.hw6.task1;

import java.util.*;
import java.util.stream.Collectors;

public class NewCollection {
    static void newCollection() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Integer num = random.nextInt() % 25;
            list.add(num);
        }

        List<Integer> newList = list.stream().filter(i -> i >= 5).sorted().collect(Collectors.toList());
        System.out.println(newList);
    }
}
