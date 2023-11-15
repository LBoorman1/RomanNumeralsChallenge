package com.sparta.lb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest
{
    private final RomanNumerals romanNumeralsTest = new RomanNumerals();

    @Test
    @DisplayName("Testing roman numerals with 390")
    public void testingRomanNumeralsWith390() {
        Assertions.assertEquals("CCCXC", romanNumeralsTest.getRomanNumeral(390));
    }

    @Test
    @DisplayName("Testing The Method with 345")
    public void testingTheMethodWith345(){
        Assertions.assertEquals("CCCXLV", romanNumeralsTest.getRomanNumeral(345));
    }

    @Test
    @DisplayName("Testing the Method with 3999")
    public void testingTheMethodWith3999(){
        Assertions.assertEquals("MMMCMXCIX", romanNumeralsTest.getRomanNumeral(3999));
    }

    @Test
    @DisplayName("Testing the method with 4234")
    public void testingTheMethodWith4234(){
        Assertions.assertEquals("Maximum number (3999) exceeded", romanNumeralsTest.getRomanNumeral(4234));
    }

    @Test
    @DisplayName("Testing the method with 0")
    public void testingTheMethodWith0(){
        Assertions.assertEquals("Invalid choice (number less than 1)", romanNumeralsTest.getRomanNumeral(0));
    }

    @Test
    @DisplayName("Testing the method with -1")
    public void testingTheMethodWithMinus1(){
        Assertions.assertEquals("Invalid choice (number less than 1)", romanNumeralsTest.getRomanNumeral(-1));
    }


}
