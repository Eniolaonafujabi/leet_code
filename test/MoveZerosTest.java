import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    @Test
    public void moveZero() {
        MoveZeros zeros = new MoveZeros();
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(12);
        expected.add(0);
        expected.add(0);
        assertEquals(expected, zeros.moveZeroes(new int[]{0, 1, 0, 3, 12}));
    }
}