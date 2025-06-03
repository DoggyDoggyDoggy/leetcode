package product_of_array_except_self_238

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n)

        var leftProduct = 1
        for (i in 0..<n) {
            result[i] = leftProduct
            leftProduct *= nums[i]
        }

        var rightProduct = 1
        for (i in n - 1 downTo 0) {
            result[i] *= rightProduct
            rightProduct *= nums[i]
        }

        return result
    }
}