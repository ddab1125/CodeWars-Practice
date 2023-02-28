package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongToIPTest {

    @Test
    void convert() {
        assertEquals("128.114.17.104", LongToIP.convert(2154959208L));
        assertEquals("0.0.0.0", LongToIP.convert(0));
        assertEquals("128.32.10.1", LongToIP.convert(2149583361L));
    }
}