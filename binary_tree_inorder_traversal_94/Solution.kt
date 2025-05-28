package binary_tree_inorder_traversal_94


class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        val stack = ArrayDeque<TreeNode?>()
        var curr = root

        while (curr != null || stack.isNotEmpty()) {
            while (curr != null) {
                stack.addLast(curr)
                curr = curr.left
            }
            curr = stack.removeLast()
            result.add(curr!!.`val`)
            curr = curr.right
        }

        return result
    }

    /*

    fun inorderTraversalRecursive(root: TreeNode?): List<Int> {
    val result = mutableListOf<Int>()
    fun dfs(node: TreeNode?) {
        if (node == null) return
        dfs(node.left)
        result.add(node.value)
        dfs(node.right)
    }
    dfs(root)
    return result
}
     */
}