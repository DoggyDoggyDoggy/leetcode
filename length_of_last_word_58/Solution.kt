package leetcode.length_of_last_word_58

class Solution {
    fun lengthOfLastWord(s: String): Int {
        return s.trim().split("\\s+".toRegex()).last().length
    }
}