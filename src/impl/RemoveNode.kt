package impl

/**
 * 不提供头结点的情况下删除当前节点
 *
 * @author Lolko.yao
 * @since 2021-04-02 10:40
 * @version 1.0
 */
fun removeNode(node: ListNode1?) {
    node?.value = node?.next?.value
    node?.next = node?.next?.next
}

class ListNode1(var value: Int?) {
    var next: ListNode1? = null
}
