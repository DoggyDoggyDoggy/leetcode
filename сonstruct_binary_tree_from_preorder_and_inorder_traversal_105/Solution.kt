package сonstruct_binary_tree_from_preorder_and_inorder_traversal_105

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (preorder.size == 1 && preorder[0] == -1) return TreeNode(-1)
        return buildNode(preorder, inorder)
    }

    private fun buildNode(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (preorder.isEmpty()) return null

        val node = TreeNode(preorder.first())
        val centerIndex = inorder.indexOf(node.`val`)

        val leftPreorder = preorder.sliceArray(1..<centerIndex + 1)
        val leftInorder = inorder.sliceArray(0..<centerIndex)

        val rightPreorder = preorder.sliceArray(centerIndex + 1..<preorder.size)
        val rightInorder = inorder.sliceArray(centerIndex + 1..<inorder.size)

        node.left = buildNode(leftPreorder, leftInorder)
        node.right = buildNode(rightPreorder, rightInorder)

        return node
    }
}