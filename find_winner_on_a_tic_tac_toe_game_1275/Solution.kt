package leetcode.find_winner_on_a_tic_tac_toe_game_1275

class Solution {
    fun tictactoe(moves: Array<IntArray>): String {
        val matrix: Array<CharArray> = Array(3) { CharArray(3) }

        for ((index, move) in moves.withIndex()) {
            matrix[move[0]][move[1]] = if (index % 2 == 0) 'A' else 'B'
        }

        if (matrix[0][0] == 'A' && matrix[1][0] == 'A' && matrix[2][0] == 'A') {
            return "A"
        } else if (matrix[0][0] == 'B' && matrix[1][0] == 'B' && matrix[2][0] == 'B') {
            return "B"
        }

        if (matrix[0][1] == 'A' && matrix[1][1] == 'A' && matrix[2][1] == 'A') {
            return "A"
        } else if (matrix[0][1] == 'B' && matrix[1][1] == 'B' && matrix[2][1] == 'B') {
            return "B"
        }

        if (matrix[0][2] == 'A' && matrix[1][2] == 'A' && matrix[2][2] == 'A') {
            return "A"
        } else if (matrix[0][2] == 'B' && matrix[1][2] == 'B' && matrix[2][2] == 'B') {
            return "B"
        }

        if (matrix[0][0] == 'A' && matrix[1][1] == 'A' && matrix[2][2] == 'A') {
            return "A"
        } else if (matrix[0][0] == 'B' && matrix[1][1] == 'B' && matrix[2][2] == 'B') {
            return "B"
        }

        if (matrix[0][2] == 'A' && matrix[1][1] == 'A' && matrix[2][0] == 'A') {
            return "A"
        } else if (matrix[0][2] == 'B' && matrix[1][1] == 'B' && matrix[2][0] == 'B') {
            return "B"
        }

        if (matrix[0][0] == 'A' && matrix[0][1] == 'A' && matrix[0][2] == 'A') {
            return "A"
        } else if (matrix[0][0] == 'B' && matrix[0][1] == 'B' && matrix[0][2] == 'B') {
            return "B"
        }

        if (matrix[1][0] == 'A' && matrix[1][1] == 'A' && matrix[1][2] == 'A') {
            return "A"
        } else if (matrix[1][0] == 'B' && matrix[1][1] == 'B' && matrix[1][2] == 'B') {
            return "B"
        }

        if (matrix[2][0] == 'A' && matrix[2][1] == 'A' && matrix[2][2] == 'A') {
            return "A"
        } else if (matrix[2][0] == 'B' && matrix[2][1] == 'B' && matrix[2][2] == 'B') {
            return "B"
        }

        if (moves.size == 9) {
            return "Draw"
        }

        return "Pending"
    }
}