package maximum_depth_of_binary_tree_104


class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun maxDepth(root: TreeNode?): Int {

        fun dfs(node: TreeNode?): Int {
            if(node == null) return 0

            val l = dfs(node.left)
            val r = dfs(node.right)

            return maxOf(l, r) + 1
        }

        return dfs(root)

    }
}