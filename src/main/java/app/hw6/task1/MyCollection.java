package app.hw6.task1;

import java.util.ArrayList;
import java.util.Collections;

public class MyCollection {
    static void myCollection() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int min = -5;
        int max = 25;

        for (int i = min; i <= max; i++) {
            list.add(i);
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
