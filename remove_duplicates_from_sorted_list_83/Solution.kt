package remove_duplicates_from_sorted_list_83

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var sorted = head

        while (sorted != null) {
            if (sorted.`val` == sorted.next?.`val`) {
                sorted.next = sorted.next?.next
            } else {
                sorted = sorted.next
            }
        }

        return head
    }
}