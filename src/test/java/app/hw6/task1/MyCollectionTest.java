package app.hw6.task1;

import org.junit.jupiter.api.Test;

import static app.hw6.task1.MyCollection.fillRandom;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MyCollectionTest {
    MyCollection testMyCollection = new MyCollection();
    @Test
    public void testMyCollectionSize() {
        testMyCollection.setArray(fillRandom(10, 25));
        assertEquals(10, testMyCollection.getArray().size(), "[ Positive test ] Error");
        assertNotEquals(11, testMyCollection.getArray().size(), "[ Negative test ] Error");
    }
}
