package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    private Map<String, Integer> letterMapping = new HashMap<String, Integer>();

    public String checkForPalindromes(String input) {
        if(isPalindromic(input)) {
            return "YES";
        }
        else {
            return "NO";
        }
    }

    private boolean isPalindromic(String input) {
        letterMapping = fillMapWithLetterCount(input);
        int countOfOddNumbers = 0;
        for (Integer numberOfOccurrences: letterMapping.values()) {
            if (numberOfOccurrences % 2 != 0) {
                countOfOddNumbers++;
            }
        }
        return input.length() > 1 && (!lengthIsEven(input) || countOfOddNumbers <= 0) && (lengthIsEven(input) || countOfOddNumbers <= 1);
    }

    public Map<String, Integer> fillMapWithLetterCount(String input) {
        char[] characters = input.toCharArray();
        for(char character : characters) {
            letterMapping.put(String.valueOf(character), getLetterCount(character, input));
        }
        return letterMapping;
    }

    private boolean lengthIsEven(String input) {
        return input.length() % 2 == 0;
    }

    public int getLetterCount(Character letter, String stringToCheck) {
        int occurrences = 0;
        for(int i = 0; i < stringToCheck.length(); i++) {
            if (stringToCheck.charAt(i) == letter) {
                occurrences++;
            }
        }
        return occurrences;
    }
}
