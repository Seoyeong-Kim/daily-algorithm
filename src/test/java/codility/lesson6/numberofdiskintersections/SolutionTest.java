package codility.lesson6.numberofdiskintersections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void name() {
        int result = new Solution().solution(new int[]{1, 2147483647, 0});
        assertEquals(result, 2);
    }
}