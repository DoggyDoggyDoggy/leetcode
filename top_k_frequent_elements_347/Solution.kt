package top_k_frequent_elements_347

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqMap = HashMap<Int, Int>()
        val buckets: Array<MutableList<Int>> = Array(nums.size + 1) { mutableListOf() }

        for (num in nums) {
            freqMap[num] = freqMap.getOrDefault(num, 0) + 1
        }

        for ((num, count) in freqMap) {
            buckets[count].add(num)
        }

        val res = mutableListOf<Int>()
        for (i in buckets.size - 1 downTo 0) {
            for (n in buckets[i]) {
                res.add(n)
                if (res.size == k) return res.toIntArray()
            }
        }

        return res.toIntArray()
    }
}