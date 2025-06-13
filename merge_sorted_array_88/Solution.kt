package merge_sorted_array_88

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m + n - 1
        var first = m - 1
        var second = n - 1

        while (second >= 0)
            nums1[i--] = if (first >= 0 && nums2[second] <= nums1[first]) nums1[first--]
            else nums2[second--]
    }
}