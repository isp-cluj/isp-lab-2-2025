package utcluj.aut.lab2.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

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
        Map<String, Integer> result = new StringAnalyzer().countVowels(strings);
        assertEquals(2, result.get("apple"));
        assertEquals(3, result.get("banana"));
        assertEquals(2, result.get("cherry"));
    }

    @Test
    public void testCountConsonants() {
        String[] strings = {"apple", "banana", "cherry"};
        Map<String, Integer> result = new StringAnalyzer().countConsonants(strings);
        assertEquals(3, result.get("apple"));
        assertEquals(3, result.get("banana"));
        assertEquals(4, result.get("cherry"));
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