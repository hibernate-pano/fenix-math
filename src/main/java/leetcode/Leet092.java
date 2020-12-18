package leetcode;

import java.util.Objects;

/**
 * @author pano
 */
public class Leet092 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {

        //排除特殊情况
        if (Objects.isNull(head) || Objects.isNull(head.next)) {
            return head;
        }
        int deep = 1;
        ListNode prev = null;
        ListNode curr = head;
        ListNode start = null;
        ListNode end = null;
        ListNode point = null;

        while (Objects.nonNull(curr)) {
            deep++;
            if (deep == m - 1) {
                start = curr;
                curr = curr.next;
            } else if (m <= deep && deep <= n) {
                if (m == deep) {
                    point = curr;
                }
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            } else if (deep == n + 1) {
                end = curr;
            }
        }

        start.next = prev;
        point.next = end;

        return head;
    }

    public ListNode reverseBetween1(ListNode head, int m, int n) {

        //排除特殊情况
        if (Objects.isNull(head) || Objects.isNull(head.next)) {
            return head;
        }
        int deep = 1;

        ListNode prev = null;
        ListNode next = null;

        //查询m-1 和 n+1
        ListNode node = head;
        while (Objects.nonNull(node)) {
            deep++;
            if (deep == m - 1) {
                prev = node;
            }
            if (deep == n + 1) {
                next = node;
            }
            node = node.next;
        }

        //当前节点
        ListNode curr = head;

        //恢复初始化深度
        deep = 1;
        while (Objects.nonNull(curr)) {
            deep++;
            if (m <= deep && deep < n) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            } else if (deep == n) {
                curr.next = next;
                curr = curr.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
