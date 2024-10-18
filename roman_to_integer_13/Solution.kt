package leetcode.roman_to_integer_13

class Solution {
    fun romanToInt(s: String): Int {
        var number = 0

        var one = false
        var ten = false
        var hundred = false

        for (c in s) {
            when (c) {
                'I' -> {
                    number += 1
                    one = true
                    ten = false
                    hundred = false
                }
                'V' -> {
                    number += if (one) 3 else 5
                    one = false
                    ten = false
                    hundred = false
                }
                'X' -> {
                    number += if (one) 8 else 10
                    ten = true
                    one = false
                    hundred = false
                }
                'L' -> {
                    number += if (ten) 30 else 50
                    one = false
                    ten = false
                    hundred = false
                }
                'C' -> {
                    number += if (ten) 80 else 100
                    hundred = true
                    one = false
                    ten = false
                }
                'D' -> {
                    number += if (hundred) 300 else 500
                    one = false
                    ten = false
                    hundred = false
                }
                'M' -> {
                    number += if (hundred) 800 else 1000
                    one = false
                    ten = false
                    hundred = false
                }
            }
        }
        return number
    }
}