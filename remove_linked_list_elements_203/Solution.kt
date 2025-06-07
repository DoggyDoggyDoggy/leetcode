package remove_linked_list_elements_203

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        val list = ListNode(0)
        list.next = head

        var front = head
        var back = list

        while (front != null) {
            if (front.`val` == `val`) {
                back.next = front.next
            } else {
                back = back.next!!
            }
            front = front.next
        }
        return list.next
    }
}