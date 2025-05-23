package maximum_average_subarray_I_643

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = 0.0
        for (i in 0..k-1) {
            sum += nums[i]
        }

        var maxSum = sum
        for (i in k..nums.size-1) {
            sum += nums[i] - nums[i - k]
            maxSum = maxOf(maxSum, sum)
        }

        return maxSum/k
    }
}