@file:JvmName("SingleNumber")

package impl

/**
 * 单个元素
 *
 * @author Lolko.yao
 * @since 2021-03-22 10:58
 * @version 1.0
 */
fun singleNumber(numbers: IntArray): Int {
    var x = 0
    for (i in numbers) {
        x = x xor i
    }
    return x
}