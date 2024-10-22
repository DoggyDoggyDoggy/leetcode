package leetcode.find_the_difference_389

class Solution {
    fun findTheDifference(s: String, t: String): Char {
        var result = 0
        for (char in s) {
            result = result xor char.code
        }
        for (char in t) {
            result = result xor char.code
        }
        return result.toChar()
    }
}