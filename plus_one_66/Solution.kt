package leetcode.plus_one_66

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            if (digits[i] == 9) {
                digits[i] = 0
                continue
            }
            digits[i]++
            return digits
        }
        return intArrayOf(1) + digits
    }
}