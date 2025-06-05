package construct_binary_tree_from_inorder_and_postorder_traversal_106

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
        if (inorder.size == 1 && inorder[0] == -1) return TreeNode(-1)
        return buildNode(inorder, postorder)
    }

    private fun buildNode(inorder: IntArray, postorder: IntArray): TreeNode? {
        if (inorder.isEmpty()) return null
        val node = TreeNode(postorder.last())
        val centerIndex = inorder.indexOf(node.`val`)
        val leftInorder = inorder.sliceArray(0..<centerIndex)
        val leftPostorder = postorder.sliceArray(0..<centerIndex)
        val rightInorder = inorder.sliceArray(centerIndex + 1..<inorder.size)
        val rightPostorder = postorder.sliceArray(centerIndex..<inorder.size - 1)

        node.left = buildNode(leftInorder, leftPostorder)
        node.right = buildNode(rightInorder, rightPostorder)

        return node
    }
}