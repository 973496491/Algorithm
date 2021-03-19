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
        return false
    }
}

fun main() {
    val c = Current()

    val isPalindrome = c.isPalindrome(123454321)
    println("isPalindrome : $isPalindrome")
}