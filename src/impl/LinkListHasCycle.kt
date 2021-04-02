package impl

import ListNode

/**
 * 链表是否存在环
 *
 * @author Lolko.yao
 * @since 2021-03-22 11:08
 * @version 1.0
 */
fun hasCycle(head: ListNode?): Boolean {
    var fastPoint = head?.next?.next
    var slowPoint = head?.next

    while (true) {
        if (fastPoint == null) {
            return false
        }
        if (slowPoint == fastPoint) {
            return true
        }
        fastPoint = fastPoint.next?.next
        slowPoint = slowPoint?.next
    }
}