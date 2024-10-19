package leetcode.can_make_arithmetic_progression_from_sequence_1502

class Solution {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        arr.sort()
        var y = 0
        for (i in 1 until arr.size) {
            if (arr[y] - arr[i] != arr[0] - arr[1]) return false
            y++
        }
        return true
    }
}