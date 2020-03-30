package leetcode.climbingstairs;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    @Test
    public void n은1일때() {
        Solution solution = new Solution();
        assertThat(solution.climbStairs(1), is(1));
    }

    @Test
    public void n은2일때() {
        Solution solution = new Solution();
        assertThat(solution.climbStairs(2), is(2));
    }

    @Test
    public void n은3일때() {
        Solution solution = new Solution();
        assertThat(solution.climbStairs(3), is(3));
    }
}