package reverse_linked_list_206



fun createList(arr: IntArray): ListNode? {
    if (arr.isEmpty()) return null
    val head = ListNode(arr[0])
    var current = head
    for (i in 1 until arr.size) {
        current.next = ListNode(arr[i])
        current = current.next!!
    }
    return head
}


class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        val sb = StringBuilder()
        var curr: ListNode? = this
        while (curr != null) {
            sb.append(curr.`val`)
            if (curr.next != null) sb.append(" -> ")
            curr = curr.next
        }
        return sb.toString()
    }
}

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var current = head

        while (current != null) {
            val nextNode = current.next
            current.next = prev
            prev = current
            current = nextNode
        }

        return prev
    }
}