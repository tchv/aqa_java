package app.hw6.task1;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyCollectionTest {
    @Test
    public void myCollectionTest1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Integer num = random.nextInt() % 25;
            list.add(num);
        }
        assertEquals(11, list.size(), "Error");
    }
}
