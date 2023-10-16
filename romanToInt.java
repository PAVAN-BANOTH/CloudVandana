package in.pspk;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static int romanToInt(String s) {
        Map<Character, Integer> rmToInt = new HashMap<>();
        rmToInt.put('I', 1);
        rmToInt.put('V', 5);
        rmToInt.put('X', 10);
        rmToInt.put('L', 50);
        rmToInt.put('C', 100);
        rmToInt.put('D', 500);
        rmToInt.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = rmToInt.get(s.charAt(i));

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "M"; 
        int integerValue = romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is " + integerValue);
    }
}


