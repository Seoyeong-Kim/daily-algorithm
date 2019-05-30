package hackerrank.comparethetriplets;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    @Test
    public void compareTriplets1() {
        List<Integer> result = Solution.compareTriplets(Arrays.asList(5, 6, 7), Arrays.asList(3, 6, 10));
        assertThat(result, is(Arrays.asList(1, 1)));
    }

    @Test
    public void compareTriplets2() {
        List<Integer> result = Solution.compareTriplets(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        assertThat(result, is(Arrays.asList(0, 0)));
    }

    @Test
    public void compareTriplets3() {
        List<Integer> result = Solution.compareTriplets(Arrays.asList(10, 15, 20), Arrays.asList(5, 6, 7));
        assertThat(result, is(Arrays.asList(3, 0)));
    }
}