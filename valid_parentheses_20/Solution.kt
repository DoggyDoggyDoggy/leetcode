package leetcode.valid_parentheses_20

class Solution {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        val matchingPairs = mapOf(')' to '(', '}' to '{', ']' to '[')

        for (char in s) {
            if (char in matchingPairs.values) {
                stack.add(char)
            } else if (char in matchingPairs.keys) {
                if (stack.isEmpty() || stack.removeAt(stack.size - 1) != matchingPairs[char]) {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}