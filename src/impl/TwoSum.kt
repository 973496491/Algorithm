package impl

import AlgorithmInterface
import java.util.HashMap

/**
 * 两数之和
 *
 * @author Loko.yao
 * @since 2021-03-19 17:10
 * @version 1.0
 */
abstract class TwoSum : AlgorithmInterface {

    override fun twoSum(numbs: IntArray, target: Int): IntArray? {
        val map = HashMap<Int, Int>()
        for (i in numbs.indices) {
            // 当前值
            val num = numbs[i]
            // 目标和与当前数的差值
            val diff = target - num
            // 如果包含了这个差值, 那么差值指向的下标就是总和减去当前值所期望值的下标
            if (map.containsKey(diff)) {
                // 获取差值指向的下标
                val diffIndex = map[diff]
                return intArrayOf(diffIndex!!, i)
            }
            // 没有包含差值, 那么用当前值做key, 当前值下标做value, 用以接下来差值的查找
            map[num] = i
        }
        return null
    }
}