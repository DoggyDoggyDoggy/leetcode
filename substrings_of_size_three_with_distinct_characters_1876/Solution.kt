package substrings_of_size_three_with_distinct_characters_1876

class Solution {
    fun countGoodSubstrings(s: String): Int {
        var result = 0

        for (i in 0..s.length - 3) {
            val subString = s.substring(i, i + 3)
            if (subString[0] != subString[1] &&
                subString[1] != subString[2] &&
                subString[0] != subString[2]
            ) result++
        }

        return result
    }
}