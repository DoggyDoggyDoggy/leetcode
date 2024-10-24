package leetcode.count_odd_numbers_in_an_interval_range_1523

class Solution {
    fun countOdds(low: Int, high: Int): Int {
        var countOdd = 0
        for (i in low..high) {
            if (i%2 != 0) countOdd++
        }
        return countOdd
    }
}