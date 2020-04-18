package leetcode.diameterofbinarytree

import java.util.*


class Solution {

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        val leftLength = root!!.left?.let { it -> calculate(it) } ?: 0
        val rightLength = root!!.right?.let { it -> calculate(it) } ?: 0

        return listOf(leftLength + rightLength, root.right?.let { diameterOfBinaryTree(it) }
                ?: 0, root.left?.let { diameterOfBinaryTree(it) } ?: 0)
                .max()!!
    }

    private fun calculate(root: TreeNode): Int {
        var result = 1

        var count = 0
        var subCount = 0

        val queue = LinkedList<TreeNode>()
        root.left?.let {
            queue.add(it)
            count++
        }
        root.right?.let {
            queue.add(it)
            count++
        }

        while (queue.isNotEmpty()) {
            val node = queue.pop()
            count--

            node.left?.let {
                queue.add(it)
                subCount++
            }
            node.right?.let {
                queue.add(it)
                subCount++
            }

            if (count == 0) {
                result++
                count = subCount
                subCount = 0
            }
        }

        return result
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun main2() {
    var t1 = TreeNode(1)
    var t2 = TreeNode(2)
    var t3 = TreeNode(3)
    var t4 = TreeNode(4)
    var t5 = TreeNode(5)

    t1.left = t2
    t1.right = t3
    t2.left = t4
    t2.right = t5

    println(Solution().diameterOfBinaryTree(t1))
}

fun main() {
    var tnull = null
    var t1 = TreeNode(1)
    var t2 = TreeNode(2)
    var t3 = TreeNode(3)
    var t6 = TreeNode(6)
    var t7 = TreeNode(7)
    var t8 = TreeNode(8)
    var t9 = TreeNode(9)
    var t10 = TreeNode(10)
    var t12 = TreeNode(12)
    var t14 = TreeNode(14)
    var t15 = TreeNode(15)
    var t18 = TreeNode(18)
    var t19 = TreeNode(19)
    var t20 = TreeNode(20)
    var t22 = TreeNode(22)
    var t25 = TreeNode(25)
    var t26 = TreeNode(26)
    var t31 = TreeNode(31)

    t1.left = t2
    t1.right = t3
    t2.left = null
    t2.right = null
    t3.left = t6
    t3.right = t7
    t6.left = t8
    t6.right = t9
    t7.left = t10
    t7.right = null
    t8.left = t12
    t8.right = null
    t9.left = t14
    t9.right = t15
    t10.left = null
    t10.right = null
    t12.left = t18
    t12.right = t19
    t14.left = t20
    t14.right = null
    t15.left = t22
    t14.right = null
    t18.left = null
    t18.right = t25
    t19.left = t26
    t19.right = null
    t20.left = null
    t20.right = null
    t22.left = null
    t22.right = t31

    println(Solution().diameterOfBinaryTree(t1))
}