
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
    @Test public void testMax() {
        Katas kat = new Katas();
        assertEquals(566, kat.listMax(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, kat.listMax(new int[]{5}));
        assertEquals(0, kat.listMin(new int[]{42, 54, 65, 87, 0}));
        assertEquals(-110, kat.listMin(new int[]{-52, 56, 30, 29, -54, 0, -110}));
    }
    
    @Test public void testMakeMove() {
        Katas kat = new Katas();
        assertEquals(3, kat.makeMove(3));
}
    @Test public void testGetCount() {
        Katas kat = new Katas();
        assertEquals("Nope!", 5, kat.getCount("abracadabra"));
      assertEquals("Nope!", 0, kat.getCount(""));
      assertEquals("Nope!", 4, kat.getCount("pear tree"));
      assertEquals("Nope!", 13, kat.getCount("o a kak ushakov lil vo kashu kakao"));
      assertEquals("Nope!", 168, kat.getCount("tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty"));
    
}
    @Test public void testDisemvowel() {
        Katas kat = new Katas();
        assertEquals("Ths wbst s fr lsrs LL!",kat.disemvowel("This website is for losers LOL!")
                                      );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", kat.disemvowel(
              "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", kat.disemvowel("What are you, a communist?"));
    
}
    @Test public void testDigitSquared() {
        Katas kat = new Katas();
        assertEquals(811181, kat.squareDigits(9119));
        assertEquals(0, kat.squareDigits(0));
  
}
    @Test public void test() {
        Katas kat = new Katas();
}
}
