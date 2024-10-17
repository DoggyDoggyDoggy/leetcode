package merge_string_alternately_1768

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var result = ""
        var word1 = word1
        var word2 = word2

        while (true) {
            if(word1 == "" && word2 == "") {
                return result
            }
            if (word1 != "") {
                result += word1.substring(0, 1)
                word1 = word1.removeRange(0, 1)
            }
            if (word2 != "") {
                result += word2.substring(0, 1)
                word2 = word2.removeRange(0, 1)
            }
        }
    }
}