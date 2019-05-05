import org.junit.Test;

import static org.junit.Assert.*;

public class RleTest {

    @Test
    public void coding() {

       assertEquals("B4A4", Rle.rleCode("BBBBAAAA"));
       assertEquals("A2C5B1", Rle.rleCode("AACCCCCB"));
       assertEquals("C2D4S2G5", Rle.rleCode("CCDDDDSSGGGGG"));
    }
    @Test
    public void decoding() {
        assertEquals("ACCC", Rle.rleDecode("A3C"));
        assertEquals("BBAAACCCC", Rle.rleDecode("2B3A4C"));
        assertEquals("BBCC", Rle.rleDecode("2B2C"));
    }
}