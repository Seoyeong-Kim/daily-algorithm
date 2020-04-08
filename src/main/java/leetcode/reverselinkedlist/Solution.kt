package leetcode.reverselinkedlist;

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var reverseNode: ListNode? = null

        var current = head
        while (current != null) {
            val nextTemp = current.next
            current.next = reverseNode
            reverseNode = current
            current = nextTemp
        }

        return reverseNode
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
