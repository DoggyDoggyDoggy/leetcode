package leetcode.spiral_matrix_54

class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val result = ArrayList<Int>(matrix.size * matrix[0].size)
        var x = matrix.size - 1
        var y = matrix[0].size - 1
        var circle = 0
        val totalElements = matrix.size * matrix[0].size

        while (result.size < totalElements) {
            for (i in circle..y) {
                result.add(matrix[circle][i])
            }
            for (i in circle + 1..x) {
                result.add(matrix[i][y])
            }
            if (circle < x) {
                for (i in y - 1 downTo circle) {
                    result.add(matrix[x][i])
                }
            }
            if (circle < y) {
                for (i in x - 1 downTo circle + 1) {
                    result.add(matrix[i][circle])
                }
            }
            x--
            y--
            circle++
        }
        return result
    }
}