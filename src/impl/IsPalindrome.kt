@file:JvmName("IsPalindrome")

package impl

/**
 * 回文数
 *
 * @author Loko.yao
 * @since 2021-03-19 17:10
 * @version 1.0
 */
fun isPalindrome(x: Int): Boolean {
    if (x == 0) return true
    if (x < 0) return false
    // x是整数直接返回false
    if (x % 10 == 0) return false

    var num = x
    var temp = 0
    while (num > 0) {
        // 将得到的余数又重新计算出一个新的值
        temp = temp * 10 + (num % 10)
        num /= 10
    }
    return x == temp
}