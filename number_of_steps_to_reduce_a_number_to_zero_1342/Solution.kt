package number_of_steps_to_reduce_a_number_to_zero_1342

class Solution {
    fun numberOfSteps(num: Int): Int {
        var steps = 0
        var numm = num
        while (numm > 0) {
            if (numm % 2 == 0) numm /= 2
            else numm -= 1
            steps++
        }

        return steps
    }
}