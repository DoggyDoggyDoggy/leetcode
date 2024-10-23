package leetcode.matrix_diagonal_sum_1572

class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        var sum = 0
        var x = mat[0].size - 1
        var y = 0
        if (mat.size % 2 != 0) {
            sum -= mat[(mat.size - 1) / 2][(mat.size - 1) / 2]
        }
        for (i in mat.indices) {
            sum += mat[i][x]
            sum += mat[i][y]
            x--
            y++
        }
        return sum
    }
}