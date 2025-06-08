package remove_element_27

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var count = 0

        var p1 = 0
        var p2 = 0

        while (p2 != nums.size) {
            if(nums[p2] == `val`) {
                p2++
            } else {
                count++
                nums[p1] = nums[p2]
                p1++
                p2++
            }
        }
        return count
    }
}