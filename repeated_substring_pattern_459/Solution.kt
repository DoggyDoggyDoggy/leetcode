package leetcode.repeated_substring_pattern_459

class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        val n = s.length
        for (len in 1..n / 2) {
            if (n % len == 0) {
                val substring = s.substring(0, len)
                val repeated = substring.repeat(n / len)
                if (repeated == s) {
                    return true
                }
            }
        }
        return false
    }
}