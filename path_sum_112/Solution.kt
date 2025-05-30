package path_sum_112

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}


class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        var result = false

        fun pathSum(node: TreeNode?, sum : Int) {
            if (node == null) return
            if (sum + node.`val` == targetSum && node.left == null && node.right == null) result = true
            pathSum(node.left, sum + node.`val`)
            pathSum(node.right,sum + node.`val`)
        }
        pathSum(root, 0)

        return result
    }
}