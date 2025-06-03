package group_anagrams_49

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groups: HashMap<String, MutableList<String>> = HashMap()

        for (str in strs) {
            val key = str.toCharArray().sorted().joinToString("")

            if (!groups.containsKey(key)) {
                groups[key] = mutableListOf()
            }

            groups[key]!!.add(str)
        }

        return groups.values.toList()
    }
}