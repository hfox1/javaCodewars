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
        assertEquals("Hello boss", kat.pMessage("jim", "jim"));
        assertEquals("Hello boss", kat.pMessage("Helen", "Helen"));
        assertEquals("Hello guest", kat.pMessage("jim", "henrietta"));
    }
    @Test public void test() {
        Katas kat = new Katas();
        assertEquals(-110, kat.listMin(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, kat.listMin(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, kat.listMax(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, kat.listMax(new int[]{5}));
    }

}
