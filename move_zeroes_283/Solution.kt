package move_zeroes_283

class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var left = 0
        for (i in 0 until nums.size) {
            if (nums[i] != 0) {
                val temp = nums[left]
                nums[left] = nums[i]
                nums[i] = temp
                left++
            }
        }
    }
}