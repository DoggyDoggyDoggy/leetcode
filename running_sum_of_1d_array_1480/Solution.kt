package running_sum_of_1d_array_1480

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        for (i in 1 until nums.size) {
            nums[i] += nums[i- 1]
        }
        return nums
    }
}