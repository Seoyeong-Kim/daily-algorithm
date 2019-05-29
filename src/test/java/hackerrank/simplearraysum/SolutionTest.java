package hackerrank.simplearraysum;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    @Test
    public void simpleArraySum1() {
        int result = Solution.simpleArraySum(new int[]{1, 2, 3, 4, 10, 11});
        assertThat(result, is(31));
    }

    @Test
    public void simpleArraySum2() {
        int result = Solution.simpleArraySum(new int[]{338, 65, 713, 595, 428, 610, 728, 573, 871, 868});
        assertThat(result, is(5789));
    }
}
