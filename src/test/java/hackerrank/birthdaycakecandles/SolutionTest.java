package hackerrank.birthdaycakecandles;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {
    @Test
    public void birthdayCakeCandles() {
        int result = Solution.birthdayCakeCandles(new int[]{3, 2, 1, 3});
        assertThat(result, is(2));
    }

    @Test
    public void birthdayCakeCandles2() {
        int result = Solution.birthdayCakeCandles(new int[]{18, 90, 90, 13, 90, 75, 90, 8, 90, 43});
        assertThat(result, is(5));
    }
}

