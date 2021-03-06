import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcronymTest {

    @Test
    public void basic() {
        final String phrase = "Portable Network Graphics";
        final String expected = "PNG";
        assertEquals(expected, new Acronym(phrase).get());
    }

    @Test
    public void lowercaseWords() {
        final String phrase = "Ruby on Rails";
        final String expected = "ROR";
        assertEquals(expected, new Acronym(phrase).get());
    }

    @Test
    public void punctuation() {
        final String phrase = "First In, First Out";
        final String expected = "FIFO";
        assertEquals(expected, new Acronym(phrase).get());
    }

    @Test
    public void NonAcronymAllCapsWord() {
        final String phrase = "GNU Image Manipulation Program";
        final String expected = "GIMP";
        assertEquals(expected, new Acronym(phrase).get());
    }

    @Test
    public void punctuationWithoutWhitespace() {
        final String phrase = "Complementary metal-oxide semiconductor";
        final String expected = "CMOS";
        assertEquals(expected, new Acronym(phrase).get());
    }

}
