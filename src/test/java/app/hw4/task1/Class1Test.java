package app.hw4.task1;

import app.hw4.task1.Class1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Class1Test {
    @Test
    public void firstTest() {
        char expected = 'a';
        char actual = new Class1().first("A");
        assertEquals(expected, actual, "Error");
    }
}
