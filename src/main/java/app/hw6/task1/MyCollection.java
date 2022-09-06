package app.hw6.task1;

import java.util.*;

public class MyCollection {
    static void myCollection() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Integer num = random.nextInt() % 25;
            list.add(num);
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
