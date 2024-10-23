package leetcode.baseball_game_682

class Solution {
    fun calPoints(operations: Array<String>): Int {
        val records = mutableListOf<Int>()
        for (operation in operations) {
            when (operation) {
                "C" -> records.removeAt(records.size - 1)
                "D" -> records.add(records[records.size - 1] * 2)
                "+" -> records.add(records[records.size - 1] + records[records.size - 2])
                else -> records.add(operation.toInt())
            }
        }
        return records.sum()
    }
}