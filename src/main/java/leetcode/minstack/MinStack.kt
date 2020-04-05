package leetcode.minstack

class MinStack {
    var top: Int = 0
    var stack = arrayListOf<Int>()

    fun push(x: Int) {
        stack.add(top,x)
        top++
    }

    fun pop() {
        stack.removeAt(top-1)
        top--
    }

    fun top(): Int {
        return stack[top-1]
    }

    fun getMin(): Int {
        return stack.min()!!
    }
}

fun main() {
    val minStack = MinStack()
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)
    println(minStack.getMin())
    minStack.pop()
    println(minStack.top())
    println(minStack.getMin())
}