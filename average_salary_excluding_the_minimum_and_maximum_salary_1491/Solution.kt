package leetcode.average_salary_excluding_the_minimum_and_maximum_salary_1491

class Solution {
    fun average(salary: IntArray): Double {
        return (salary.sum() - salary.max() - salary.min()).toDouble() / (salary.size - 2)
    }
}