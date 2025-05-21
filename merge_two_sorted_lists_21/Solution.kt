package merge_two_sorted_lists_21

/*
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
*/

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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val newList = ListNode(0)
        var l1 = list1
        var l2 = list2
        var current = newList

        while (l1 != null && l2 != null) {
            if (l1.`val` <= l2.`val`) {
                current.next = l1
                l1 = l1.next
            } else {
                current.next = l2
                l2 = l2.next
            }
            current = current.next!!
        }

        current.next = l1 ?: l2

        return newList.next
    }
}