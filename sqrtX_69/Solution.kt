package sqrtX_69

class Solution {
    fun mySqrt(x: Int): Int {
        var l = 1
        var r = x
        while (l <= r) {
            val mid = (l + r) / 2
            if (x / mid == mid) {
                return mid
            } else if (mid > x / mid) {
                r = mid - 1
            } else {
                l = mid + 1
            }
        }
        return r
    }
}