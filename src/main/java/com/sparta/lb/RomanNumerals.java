package com.sparta.lb;

import java.util.TreeMap;

public class RomanNumerals {

    /*Has the values that map to each roman numeral character, stored from largest to smallest*/
    private final TreeMap<Integer, String> valueRoman = new TreeMap<Integer, String>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public String getRomanNumeral(int numberToConvert) {
        if(numberToConvert > 3999) {
            return "Maximum number (3999) exceeded";
        } else if (numberToConvert < 1) {
            return "Invalid choice (number less than 1)";
        }
        StringBuilder sequence = new StringBuilder();
        int remaining = numberToConvert;
        while(remaining != 0) {
            for(Integer value: valueRoman.descendingKeySet()) {
                String roman = valueRoman.get(value);
                if(remaining >= value) {
                    sequence.append(roman);
                    remaining = remaining - value;
                    break;
                }
            }
        }
        return sequence.toString();
    }
}
