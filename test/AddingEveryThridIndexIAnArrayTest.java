import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddingEveryThridIndexIAnArrayTest {

    @Test
    public void testAddingEveryThridIndexIAnArray() {
        int[] a = {2,3,1,4,2,1};
        int[] b = {6,7};
        assertArrayEquals(AddingEveryThridIndexIAnArray.add(a),b);
    }

        @Test
    public void testAddingEveryThridIndexIAnArray2() {
        int[] a = {1,1,1,2,2,2};
        int[] b = {3,6};
        assertArrayEquals(AddingEveryThridIndexIAnArray.add(a),b);
    }
}