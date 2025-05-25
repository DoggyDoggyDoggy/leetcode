package minimum_recolors_to_get_k_consecutive_black_blocks_2379

class Solution {
    fun minimumRecolors(blocks: String, k: Int): Int {
        var recolor = blocks.count { it == 'W' }

        for (i in 0..<blocks.length - (k - 1)) {
            val subString = blocks.substring(i, i + k)
            val subStringWhiteBLocks = subString.count { it == 'W' }
            if (subStringWhiteBLocks < recolor) recolor = subStringWhiteBLocks
        }

        return recolor
    }

    // Fast Solution

    //fun minimumRecolors(blocks: String, k: Int): Int {
    //    val blocksArray = blocks.toCharArray()
    //    var currentNumOfWhites = 0
    //    for (i in 0 until k) {
    //        if (blocksArray[i] == 'W') currentNumOfWhites++
    //    }
    //
    //    var minNumOfOps = currentNumOfWhites
    //    for (i in 1 until blocksArray.size - k + 1) {
    //        if (blocksArray[i - 1] == 'W') currentNumOfWhites--
    //        if (blocksArray[i + k - 1] == 'W') currentNumOfWhites++
    //        minNumOfOps = minOf(minNumOfOps, currentNumOfWhites)
    //    }
    //
    //    return minNumOfOps
    //}
}

