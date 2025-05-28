package binary_tree_preorder_traversal_144

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        //val result = mutableListOf<Int>()
        //fun dfs(node: TreeNode?) {
        //    if (node == null) return
        //    result.add(node.`val`)
        //    dfs(node.left)
        //    dfs(node.right)
        //}
        //dfs(root)
        //return result
        val result = mutableListOf<Int>()
        if (root == null) return result

        val stack = ArrayDeque<TreeNode>()
        stack.add(root)

        while (stack.isNotEmpty()) {
            val node = stack.removeLast()
            result.add(node.`val`)

            // Push right child first so that left is processed first
            node.right?.let { stack.add(it) }
            node.left?.let { stack.add(it) }
        }

        return result
    }
}