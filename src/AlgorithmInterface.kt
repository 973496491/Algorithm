import impl.ListNode

/**
 * 文件头
 *
 * @author Loko.yao
 * @since 2021-03-16 15:15
 * @version 1.0
 */
interface AlgorithmInterface {

    /**
     * 两数之和
     */
    fun twoSum(numbs: IntArray, target: Int): IntArray?

    /**
     * 回文数
     * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
     */
    fun isPalindrome(x: Int): Boolean

    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     */
    fun singleNumber(nums: IntArray): Int

    /**
     * 给定一个链表，判断链表中是否有环。
     */
    fun linkListHasCycle(node: ListNode): Boolean

}