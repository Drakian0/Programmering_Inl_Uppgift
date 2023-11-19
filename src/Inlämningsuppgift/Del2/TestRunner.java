package Inlämningsuppgift.Del2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRunner {
    @Test
    public void testChars(){
        Counter counter = new Counter();
        int expected = 3;

        counter.count("Hej");
        int actual = counter.getChars();

        assertEquals(expected, actual);
    }

    @Test
    public void testStop(){
        Counter counter = new Counter();
        boolean expected = false;

        counter.count("stop");
        boolean actual = counter.isOn();

        assertEquals(expected, actual);
    }

    @Test
    public void testWords(){
        Counter counter = new Counter();
        int expected = 2;

        counter.count("Hej Isak");
        int actual = counter.getWords();

        assertEquals(expected, actual);
    }
}
