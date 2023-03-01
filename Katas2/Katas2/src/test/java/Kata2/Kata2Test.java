package Kata2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata2Test {

    @Test public void testSquareDigits() {
        Kata2 kat = new Kata2();
        assertEquals(811181, kat.squareDigits(9119));
        System.out.println("expected " + 811181 + ", Received: " + kat.squareDigits(9119));
        assertEquals(0, kat.squareDigits(0));

    }
}

