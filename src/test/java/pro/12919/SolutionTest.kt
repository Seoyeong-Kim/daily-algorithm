package pro.`12919`


import org.junit.Assert.assertTrue
import org.junit.Test

class SolutionTest {
    @Test
    fun test1() {
        val solution = Solution()
        val answer = solution.solution(arrayOf("Jane","Kim"))
        assertTrue(answer.equals("김서방은 1에 있다"))
    }
}