package contains_duplicate_217

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val seen = mutableSetOf<Int>()
        nums.forEach {
            if (it in seen) return true
            seen.add(it)
        }
        return false
    }
}