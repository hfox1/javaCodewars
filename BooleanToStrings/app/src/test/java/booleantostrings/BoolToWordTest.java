/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package booleantostrings;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoolToWordTest {
    @Test public void testBoolToWord() {
        BoolToWord bToWord = new BoolToWord();
        assertEquals("Yes", bToWord.boolToWord(true));
    }
    @Test public void testBoolToWord() {
        BoolToWord bToWord = new BoolToWord();
        assertEquals("No", bToWord.boolToWord(false));
    }
}
