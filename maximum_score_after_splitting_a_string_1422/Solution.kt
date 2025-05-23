package maximum_score_after_splitting_a_string_1422

class Solution {
    fun maxScore(s: String): Int {
        var maxScore = 0
        var leftZeros = 0
        var rightOnes = s.count { it == '1' }

        for (i in 0 until s.length - 1) {
            if (s[i] == '0') {
                leftZeros++
            } else {
                rightOnes--
            }

            val score = leftZeros + rightOnes
            maxScore = maxOf(maxScore, score)
        }

        return maxScore
    }
}