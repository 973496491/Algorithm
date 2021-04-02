package impl

import ListNode
import java.util.*


/**
 * 反转链表
 *
 * @author Lolko.yao
 * @since 2021-04-02 13:56
 * @version 1.0
 */
fun reverseNode(head: ListNode?): ListNode? {
    var preNode: ListNode? = null
    var curNode = head
    var nextNode: ListNode?
    while (curNode != null) {
        nextNode = curNode.next
        curNode.next = preNode
        preNode = curNode
        curNode = nextNode
    }
    return preNode
}

fun reverseNode2(head: ListNode?): ListNode? {
    var curNode = head
    val stack = Stack<ListNode>()
    while (curNode != null) {
        stack.push(curNode)
        curNode = curNode.next
    }
    val headNode = stack.pop()
    var firstNode: ListNode = headNode
    while (stack.isNotEmpty()) {
        val cNode = stack.pop()
        firstNode.next = cNode
        firstNode = cNode
    }
    firstNode.next = null
    return headNode
}