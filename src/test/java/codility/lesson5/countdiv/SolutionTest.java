package codility.lesson5.countdiv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void name() {
        int result = new Solution().solution(6, 11, 2);
        assertEquals(result, 3);

        int result2 = new Solution().solution(6, 6, 2);
        assertEquals(result2, 1);
    }
}