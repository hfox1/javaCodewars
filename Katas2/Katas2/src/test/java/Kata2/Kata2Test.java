package Kata2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata2Test {

    @Test public void testSquareDigits() {
        assertEquals(811181, Kata2.squareDigits(9119));
        System.out.println("expected " + 811181 + ", Received: " + Kata2.squareDigits(9119));
        assertEquals(0, Kata2.squareDigits(0));

    }
    @Test public void bmiTest() {
        assertEquals( "Underweight", Kata2.bmi(10, 3), "one");
        assertEquals("Normal", Kata2.bmi(100, 2), "two");
        assertEquals("Overweight", Kata2.bmi(101, 2), "three");
        assertEquals("Obese", Kata2.bmi(60, 1.3), "four");
    }
    @Test public void testStringToArray() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, Kata2.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, Kata2.stringToArray("I love arrays they are my favorite"));

    }
    @Test public void testFindShort() {
        assertEquals(3, Kata2.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, Kata2.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, Kata2.findShort("Let's travel abroad shall we"));
    }
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void testNBDig() {
        System.out.println("Fixed Tests nbDig");
        testing(Kata2.nbDig(10, 1), 4);
        testing(Kata2.nbDig(5750, 0), 4700);
        testing(Kata2.nbDig(11011, 2), 9481);
        testing(Kata2.nbDig(12224, 8), 7733);
        testing(Kata2.nbDig(11549, 1), 11905);
    }
    @Test public void testA() {
    }
}

