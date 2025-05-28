package binary_tree_level_order_traversal_102

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()

        if (root == null) {
            return result
        }

        var currentLevel = listOf<TreeNode>(root)

        while (currentLevel.isNotEmpty()) {
            val currentLevelValues = mutableListOf<Int>()
            val nextLevel = mutableListOf<TreeNode>()

            currentLevel.forEach { node ->
                currentLevelValues.add(node.`val`)

                node.left?.let { nextLevel.add(it) }
                node.right?.let { nextLevel.add(it) }
            }

            result.add(currentLevelValues)
            currentLevel = nextLevel
        }

        return result
    }
}