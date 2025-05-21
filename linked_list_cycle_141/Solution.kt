package linked_list_cycle_141

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
    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head

        while (fast != null && fast.next != null) {
            fast = fast.next!!.next
            slow = slow!!.next

            if (slow == fast) {
                return true
            }
        }

        return false
    }
}