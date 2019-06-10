package hackerrank.timeconversion;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    @Test
    public void timeConversion() {
        String result = Solution.timeConversion("07:05:45PM");

        assertThat(result, is("19:05:45"));
    }

    @Test
    public void timeConversion2() {
        String result = Solution.timeConversion("12:40:22AM");

        assertThat(result, is("00:40:22"));
    }

    @Test
    public void timeConversion3() {
        String result = Solution.timeConversion("12:45:54PM");

        assertThat(result, is("12:45:54"));
    }
}