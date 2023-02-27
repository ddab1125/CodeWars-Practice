package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChromosomesKataTest {

    @Test
    void determineGender() {
        assertEquals("Congratulations! You're going to have a son.", codewars.ChromosomesKata.determineGender("XY"));
        assertEquals("Congratulations! You're going to have a son.", codewars.ChromosomesKata.determineGender("xy"));
        assertEquals("Congratulations! You're going to have a daughter.", codewars.ChromosomesKata.determineGender("XX"));
        assertEquals("Congratulations! You're going to have a daughter.", codewars.ChromosomesKata.determineGender("Xx"));
        assertEquals("Wrong Input", codewars.ChromosomesKata.determineGender("XC"));
        assertEquals("Wrong Input", codewars.ChromosomesKata.determineGender("xc"));
    }
}