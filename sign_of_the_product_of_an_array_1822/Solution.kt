package leetcode.sign_of_the_product_of_an_array_1822

class Solution {
    fun arraySign(nums: IntArray): Int {
        var negativeNums = 0
        for (i in nums.indices) {
            if (nums[i] == 0) {
                return 0
            } else if (nums[i] < 0) {
                negativeNums++
            }
        }
       return if (negativeNums%2 == 0) 1 else -1
    }
}