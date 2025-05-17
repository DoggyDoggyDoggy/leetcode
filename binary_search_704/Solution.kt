package binary_search_704

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        return binarySearch(nums, target, 0, nums.size - 1)
    }

    private fun binarySearch(nums: IntArray, target: Int, l: Int, r: Int): Int {
        val mid = (l + r) / 2
        return when {
            l > r -> -1
            nums[mid] == target -> mid
            nums[mid] > target -> binarySearch(nums, target, l, mid - 1)
            else -> binarySearch(nums, target, mid + 1, r)
        }
    }
}