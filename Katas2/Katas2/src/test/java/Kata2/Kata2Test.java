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
        assertEquals("Underweight", Kata2.bmi(10, 3));
        assertEquals("Normal", Kata2.bmi(100, 2));
        assertEquals("Overweight", Kata2.bmi(101, 2));
        assertEquals("Obese", Kata2.bmi(60, 1.3));
    }
    @Test public void aTest() {

    }
}

