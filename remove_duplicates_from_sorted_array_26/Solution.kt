package remove_duplicates_from_sorted_array_26

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var p1 = 0
        var p2 = 0

        while (nums.size > p2) {
            if (nums[p1] == nums[p2]) {
                p2++
            } else if (
                nums[p2] > nums[p1]
            ) {
                p1++
                nums[p1] = nums[p2]
                p2++
            }
        }
        return p1 + 1
    }
}