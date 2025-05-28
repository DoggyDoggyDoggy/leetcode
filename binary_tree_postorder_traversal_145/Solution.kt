package binary_tree_postorder_traversal_145

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        //val result = mutableListOf<Int>()
        //fun postOrder(node: TreeNode?) {
        //    if (node == null) return
        //    postOrder(node.left)
        //    postOrder(node.right)
        //    result.add(node.value)
        //}
        //postOrder(root)
        //return result

        val result = mutableListOf<Int>()
        val stack = ArrayDeque<TreeNode>()
        var current = root
        var lastVisited: TreeNode? = null

        while (current != null || stack.isNotEmpty()) {
            if (current != null) {
                stack.addLast(current)
                current = current.left
            } else {
                val peekNode = stack.last()
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    current = peekNode.right
                } else {
                    result.add(peekNode.`val`)
                    lastVisited = stack.removeLast()
                }
            }
        }

        return result
    }
}