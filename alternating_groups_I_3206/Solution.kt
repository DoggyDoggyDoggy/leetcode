package alternating_groups_I_3206

class Solution {
    fun numberOfAlternatingGroups(colors: IntArray): Int {
        var groups = 0

        val n = colors.size

        for (i in 0 until n) {
            val a = colors[i]
            val b = colors[(i + 1) % n]
            val c = colors[(i + 2) % n]

            if (a == c && a != b) {
                groups++
            }
        }

        return groups
    }
}