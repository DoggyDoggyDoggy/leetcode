package leetcode.robot_return_to_origin_657

class Solution {
    fun judgeCircle(moves: String): Boolean {
        var right = 0
        var left = 0
        var down = 0
        var up = 0

        for (c in moves){
            when (c) {
                'R' -> right++
                'L' -> left++
                'D' -> down++
                'U' -> up++
            }
        }
        return if (right == left && down == up) true else false
    }
}