package utcluj.aut.lab2.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringAnalyzerTest {

    @Test
    public void testParseInput() {
        String input = "apple;banana;cherry";
        String[] expected = {"apple", "banana", "cherry"};
        assertArrayEquals(expected, new StringAnalyzer().parseInput(input));
    }

    @Test
    public void testFindLongest() {
        String[] strings = {"apple", "banana", "cherry", "date"};
        String[] expected = {"banana", "cherry"};
        assertArrayEquals(expected, new StringAnalyzer().findLongest(strings));
    }

    @Test
    public void testFindShortest() {
        String[] strings = {"apple", "banana", "cherry", "date"};
        String[] expected = {"date"};
        assertArrayEquals(expected, new StringAnalyzer().findShortest(strings));
    }

    @Test
    public void testCountVowels() {
        String[] strings = {"apple", "banana", "cherry"};
        int[] expected = {2, 3, 2};
        assertArrayEquals(expected, new StringAnalyzer().countVowels(strings));
    }

    @Test
    public void testCountConsonants() {
        String[] strings = {"apple", "banana", "cherry"};
        int[] expected = {3, 3, 5};
        assertArrayEquals(expected, new StringAnalyzer().countConsonants(strings));
    }

    @Test
    public void testFindMostVowels() {
        String[] strings = {"apple", "banana", "cherry"};
        String[] expected = {"banana"};
        assertArrayEquals(expected, new StringAnalyzer().findMostVowels(strings));
    }

    @Test
    public void testFindMostConsonants() {
        String[] strings = {"apple", "banana", "cherry"};
        String[] expected = {"cherry"};
        assertArrayEquals(expected, new StringAnalyzer().findMostConsonants(strings));
    }
}