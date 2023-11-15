package com.sparta.lb;

public class App 
{
    public static void main( String[] args ) {
        RomanNumerals romanNumeral = new RomanNumerals();
        String sequenceToPrint = romanNumeral.getRomanNumeral(3899);
        System.out.println(sequenceToPrint);
    }
}
