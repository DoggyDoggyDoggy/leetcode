package palindrome_number_9

class Solution {fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    if (x in 0..9) return true

    val size = numberSize(x)

    for (i in 0 until size / 2) {
        val left = getDigitFromLeft(x, i, size)
        val right = getDigitFromRight(x, i)
        if (left != right) return false
    }

    return true
}

    fun numberSize(n: Int): Int {
        var x = n
        var count = 0
        while (x > 0) {
            x /= 10
            count++
        }
        return count
    }

    fun getDigitFromLeft(x: Int, index: Int, totalSize: Int): Int {
        var n = x
        repeat(totalSize - index - 1) {
            n /= 10
        }
        return n % 10
    }

    fun getDigitFromRight(x: Int, index: Int): Int {
        var pow = 1
        repeat(index) {
            pow *= 10
        }
        return (x / pow) % 10
    }
}