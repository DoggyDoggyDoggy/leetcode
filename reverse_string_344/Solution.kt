package reverse_string_344

class Solution {
    fun reverseString(s: CharArray): Unit {
        var p1 = 0
        var p2 = s.size - 1
        while (p2 > p1) {
            val temp = s[p1]
            s[p1] = s[p2]
            s[p2] = temp
            p1++
            p2--
        }
    }
}