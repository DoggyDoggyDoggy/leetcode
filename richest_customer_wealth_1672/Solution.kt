package leetcode.richest_customer_wealth_1672

class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maxWealth = 0
        for (account in accounts) {
            if (account.sum() > maxWealth) {
                maxWealth = account.sum()
            }
        }
        return maxWealth
    }
}