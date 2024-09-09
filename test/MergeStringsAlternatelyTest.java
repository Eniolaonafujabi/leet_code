import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeStringsAlternatelyTest {

    @Test
    public void mergeStringsAlternately() {
        String expected = "apbqcr";
        MergeStringsAlternately a = new MergeStringsAlternately();
        assertEquals(a.mergeAlternately("abc","pqr"),expected);
    }

    @Test
    public void mergeStringsAlternately2() {
        String expected = "apbqrs";
        MergeStringsAlternately a = new MergeStringsAlternately();
        assertEquals(a.mergeAlternately("ab","pqrs"),expected);
    }

}