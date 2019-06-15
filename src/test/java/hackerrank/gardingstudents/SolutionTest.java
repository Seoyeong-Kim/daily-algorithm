package hackerrank.gardingstudents;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    @Test
    public void gardingStudents1() {
        int[] result = Solution.gradingStudents(new int[]{73, 67, 38, 33});
        assertThat(result, is(new int[] {75, 67, 40, 33}));
    }
}