package valid_anagram_242

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        var validAnagram = false
        var firstWord = s
        var secondWord = t

        var countTrue = 0

        if (firstWord.length == secondWord.length) {
            for (i in firstWord.indices) {
                for (y in secondWord.indices) {
                    if (firstWord[i] == secondWord[y]) {
                        secondWord = secondWord.removeRange(y, y + 1)
                        countTrue++
                        break
                    }
                }
            }
        }

        if (countTrue == firstWord.length) {
            validAnagram = true
        }

        return validAnagram
    }
}