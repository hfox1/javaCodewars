/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Katas;

import org.junit.Test;
import static org.junit.Assert.*;

public class KatasTest {
    @Test public void testOpposite() {
        Katas kat = new Katas();
        assertEquals(-1, kat.opposite(1));
        assertEquals(-14, kat.opposite(14));
        assertEquals(-34, kat.opposite(34));
    }
    @Test public void testPMessage() {
        Katas kat = new Katas();
        assertEquals("Hello boss", kat.pMessage("jim", "jim"))
    }
    @Test public void testPMessage1() {
        Katas kat = new Katas();
        assertEquals("Hello guest", kat.pMessage("jim", "henrietta"))
    }
    @Test public void testOpposite3() {
        Katas kat = new Katas();
    }
}
