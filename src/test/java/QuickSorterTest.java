import junit.framework.TestCase;
import java.util.Arrays;

public class QuickSorterTest extends TestCase {
    private QuickSorter sorter;

    protected void setUp() throws Exception {
        sorter = new QuickSorter();
    }

    public void testItSorts6ElementArray() throws Exception {
        int[] input = new int[]{8, 3, 2, 7, 1, 9};
        sorter.sort(input);
        int[] expected = new int[]{1, 2, 3, 7, 8, 9};
        assertTrue(Arrays.equals(expected, input));
    }

    public void testItSorts0ElementArray() throws Exception {
        int[] input = new int[]{};
        sorter.sort(input);
        int[] expected = new int[]{};
        assertTrue(Arrays.equals(expected, input));
    }

    public void testItSorts3ElementArray() throws Exception {
        int[] input = new int[]{5, 1, 3};
        sorter.sort(input);
        int[] expected = new int[]{1, 3, 5};
        assertTrue(Arrays.equals(expected, input));
    }
}
