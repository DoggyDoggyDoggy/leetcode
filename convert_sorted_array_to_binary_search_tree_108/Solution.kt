package convert_sorted_array_to_binary_search_tree_108

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        fun createBST(start: Int, end: Int): TreeNode? {
            if (start > end) return null
            val mid = (start + end) / 2
            val treeNode = TreeNode(nums[mid])
            treeNode.left = createBST(start, mid - 1)
            treeNode.right = createBST(mid + 1, end)
            return treeNode
        }
        return createBST(0, nums.size - 1)
    }
}