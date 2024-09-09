import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AddingUsingArrayTest {

    @Test
    public void testAddingUsingArray() {
        int[] array = {2, 3, 4, 5};
        ArrayList<Character> expected = new ArrayList<>();
        expected.add('2');
        expected.add('3');
        expected.add('4');
        expected.add('6');
        AddingUsingArray a = new AddingUsingArray();
        ArrayList<Character> actual = a.add(array,1);
        assertEquals(actual, expected);
    }

    @Test
    public void testAddingUsingArray2() {
        int[] array = {9, 9, 9, 9};
        ArrayList<Character> expected = new ArrayList<>();
        expected.add('1');
        expected.add('0');
        expected.add('0');
        expected.add('0');
        expected.add('0');
        AddingUsingArray a = new AddingUsingArray();
        ArrayList<Character> actual = a.add(array,1);
        assertEquals(actual, expected);
    }
}