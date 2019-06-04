package hackerrank.diagonaldifference;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void diagonalDifference1() {
        int result = Solution.diagonalDifference(new int[][]{{11, 2, 4}, {4, 5, 6}, {10, 8, -12}});
        assertThat(result, is(15));
    }
}