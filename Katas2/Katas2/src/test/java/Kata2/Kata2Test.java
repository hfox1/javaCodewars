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
    @Test public void testA() {

    }
}

