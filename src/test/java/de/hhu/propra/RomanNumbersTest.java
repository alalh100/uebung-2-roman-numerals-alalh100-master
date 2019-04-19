package de.hhu.propra;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumbersTest {
    @Test
    public void oneIsI() {

        RomanNumbers number = new RomanNumbers();
        assertEquals("I", number.convert(1)); // Replace me
    }
}
