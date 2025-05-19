package valid_perfect_square_367

class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var l = 1
        var r = num

        while (l <= r) {
            val mid = (l + r) / 2
            if (num / mid == mid && num % mid == 0) return true
            else if (num / mid < mid) r = mid - 1
            else l = mid + 1
        }
        return false
    }
}