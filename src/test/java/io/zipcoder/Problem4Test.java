package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class Problem4Test {

    @Test
    public void checkForPalindromesTest() {
        Problem4 problem4 = new Problem4();
        String input = "aaabbbb";

        String expected = "YES";
        String actual = problem4.checkForPalindromes(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkForPalindromesTest2() {
        Problem4 problem4 = new Problem4();
        String input = "cdefghmnopqrstuvw";

        String expected = "NO";
        String actual = problem4.checkForPalindromes(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkForPalindromesTest3() {
        Problem4 problem4 = new Problem4();
        String input = "cdcdcdcdeeeef";

        String expected = "YES";
        String actual = problem4.checkForPalindromes(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkForPalindromesEmptyString() {
        Problem4 problem4 = new Problem4();
        String input = "";

        String expected = "NO";
        String actual = problem4.checkForPalindromes(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOccurencesTest() {
        Problem4 problem4 = new Problem4();
        String input = "aaabbbb";

        int expected = 3;
        int actual = problem4.getLetterCount('a', input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fillMapTest() {
        Problem4 problem4 = new Problem4();
        String input = "aaabbbb";
        Map<String, Integer> testMap = problem4.fillMapWithLetterCount(input);

        Integer expected = 3;
        Integer actual = testMap.get("a");

        Assert.assertEquals(expected, actual);
    }

}
