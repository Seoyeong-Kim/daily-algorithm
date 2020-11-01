package leetcode.maximaldepthofbinarytree

import java.util.*

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        root ?: return 0

        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)

        var depth = 1
        var size = 1
        var nextSize = 0
        while (!queue.isEmpty()) {
            if (size == 0) {
                depth++
                size = nextSize
                nextSize = 0
            }

            val current = queue.poll()
            size--

            current?.left?.let {
                queue.add(it)
                nextSize++
            }
            current?.right?.let {
                queue.add(it)
                nextSize++
            }
        }

        return depth
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}