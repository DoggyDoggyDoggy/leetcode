package ransom_note_383

class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val map = mutableMapOf<Char, Int>()

        magazine.forEach {
            var count = map[it] ?: 0
            map[it] = ++count
        }

        ransomNote.forEach {
            var count = map[it]
            println(count)
            if (count == null || count == 0) {
                return false
            } else {
                map[it] = --count
            }
        }
        return true
    }
}