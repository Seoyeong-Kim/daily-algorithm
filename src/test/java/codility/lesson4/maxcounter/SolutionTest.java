package codility.lesson4.maxcounter;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test() {
        Solution solution = new Solution();

        int[] result = solution.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        String resultString = Arrays.stream(result)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        assertEquals(resultString, "3, 2, 2, 4, 2");
    }
}