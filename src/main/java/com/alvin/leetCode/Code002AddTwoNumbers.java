package com.alvin.leetCode;

/**
 * @Description Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * @Author 田云
 * @Date 2019/6/3 23:19
 * @Version 1.0
 */
public class Code002AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode1 = l1;
        ListNode listNode2 = l2;

        ListNode listNodeTmp = new ListNode(-1);
        ListNode listNodeResult = listNodeTmp;

        int carried = 0;

        while (listNode1 != null || listNode2 != null) {
            int a = listNode1 == null ? 0 : listNode1.val;
            int b = listNode2 == null ? 0 : listNode2.val;
            listNodeTmp.next = new ListNode((a + b + carried) % 10);
            carried = (a + b + carried) / 10;

            listNodeTmp = listNodeTmp.next;
            listNode1 = listNode1 == null ? null : listNode1.next;
            listNode2 = listNode2 == null ? null : listNode2.next;
        }

        /**
         * 处理最后一个
         */
        listNodeTmp.next = carried == 0 ? null : new ListNode(1);
        return listNodeResult.next;

    }

    public static void main(String[] args) {
        /**
         * 第一个数
         */
        ListNode listNode1 = new ListNode(2);
        listNode1.addNode(new ListNode(4));
        listNode1.addNode(new ListNode(3));

        /**
         * 第二个数
         */
        ListNode listNode2 = new ListNode(5);
        listNode2.addNode(new ListNode(6));
        listNode2.addNode(new ListNode(4));

        ListNode listNode = new Code002AddTwoNumbers().addTwoNumbers(listNode1, listNode2);
        do {
            System.out.println(listNode.val);
            listNode = listNode.next;
        } while (listNode != null);

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    /**
     * 节点扩充
     *
     * @param listNodeNew
     */
    void addNode(ListNode listNodeNew) {
        ListNode nodeLast = this;
        ListNode nodeNext = this.next;
        while (nodeNext != null) {
            nodeLast = nodeNext;
            nodeNext = nodeNext.next;
        }
        nodeLast.next = listNodeNew;
    }
}