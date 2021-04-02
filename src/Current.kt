/**
 * 文件头
 *
 * @author Loko.yao
 * @version 1.0
 * @since 2021-03-19 16:58
 */
class Current : AlgorithmInterface {

    override fun twoSum(numbs: IntArray, target: Int): IntArray? {
        val map = HashMap<Int, Int>()
        for (i in numbs.indices) {
            val num = numbs[i]
            val diffNum = target - num
            if (map.containsKey(diffNum)) {
                return intArrayOf(i, map[diffNum]!!)
            }
            map[numbs[i]] = i
        }
        return null
    }

    override fun isPalindrome(x: Int): Boolean {
        if (x == 0) return true
        if (x < 0) return false
        if (x % 10 == 0) return false
        var tempX = x
        var z = 0
        while (tempX > 0) {
            z = z * 10 + tempX % 10
            tempX /= 10
        }
        return z == x
    }

    override fun singleNumber(nums: IntArray): Int {
        var x = 0
        for (num in nums) {
            x = x xor num
        }
        return x
    }

    override fun linkListHasCycle(node: ListNode): Boolean {
        var slowPoint = node.next
        var fastPoint = slowPoint?.next

        while (true) {
            if (fastPoint == null) {
                return false
            }
            if (fastPoint == slowPoint) {
                return true
            }
            slowPoint = slowPoint?.next
            fastPoint = fastPoint.next?.next
        }
    }

    override fun removeNode(node: ListNode?) {}

    override fun reverseNode(head: ListNode?): ListNode? { return null }
}

fun main() {

}