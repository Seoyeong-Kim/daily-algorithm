package leetcode.buddystrings

class Solution {
    fun buddyStrings(A: String, B: String): Boolean {
        if (A.length != B.length) {
            return false
        }

        var changeChar = CharArray(2)
        var isChange = false
        for (i in A.indices) {

            if (A[i] == B[i]) {
                continue
            }

            if (isChange) {
                return false
            }

            if (changeChar[0].toInt() == 0) {
                changeChar[0] = A[i]
                changeChar[1] = B[i]
                continue
            }

            if (changeChar[0] != B[i]) {
                return false
            }

            if (changeChar[1] != A[i]) {
                return false
            }

            isChange = true
        }

        if (!isChange && A.toSortedSet().size != A.length) {
            return true
        }

        return isChange
    }

    fun buddyStrings2(A: String, B: String): Boolean {
        if (A.length != B.length) return false

        return if (A == B) {
            if (A.toSortedSet().size != A.length) {
                return true
            }
            return false
        } else {
            var first = -1
            var second = -1
            for (i in A.indices) {
                if (A[i] != B[i]) {
                    when {
                        first == -1 -> {
                            first = i
                        }
                        second == -1 -> {
                            second = i
                        }
                        else -> return false
                    }
                }
            }
            second != -1 && A[first] == B[second] && A[second] == B[first]
        }
    }
}

fun main() {
    val s = Solution()
    println(s.buddyStrings("aa", "aa"))
}