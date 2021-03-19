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

}