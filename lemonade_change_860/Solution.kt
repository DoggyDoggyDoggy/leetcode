package leetcode.lemonade_change_860

class Solution {
    fun lemonadeChange(bills: IntArray): Boolean {
        var five = 0
        var ten = 0

        for (bill in bills) {
            if (bill == 5) {
                five++
                continue
            }
            else if (bill == 10 && five > 0) {
                five --
                ten++
                continue
            }
            else if (bill == 20 && five > 0 && ten > 0) {
                five --
                ten--
                continue
            } else if (bill == 20 && five > 2) {
                five-=3
                continue
            }else return false

        }
        return true
    }
}