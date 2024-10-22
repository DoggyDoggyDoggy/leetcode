package leetcode.monotonic_array_896

class Solution {
    fun isMonotonic(nums: IntArray): Boolean {
        var increase = true
        var decrease = true

        for (i in 0 until nums.size - 1) {
            if (nums[i] < nums[i + 1]) {
                decrease = false
            } else if (nums[i] <= nums[i + 1]) {}
            else increase = false
        }

        return (increase || decrease)
    }
}