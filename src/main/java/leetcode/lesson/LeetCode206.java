package leetcode.lesson;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author pano
 * 反转链表
 */
public class LeetCode206 {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 链表反转
     */
    public ListNode reverseList(ListNode head) {

        if (Objects.isNull(head) || Objects.isNull(head.next)) {
            return head;
        }

        List<ListNode> list = new ArrayList<>();
        list.add(head);

        while (Objects.nonNull(head.next)) {
            head = head.next;
            list.add(head);
        }

        for (int i = list.size() - 1; i > 0; i--) {
            list.get(i).next = list.get(i - 1);
        }
        list.get(0).next = null;

        return list.get(list.size() - 1);
    }


    /**
     * 链表反转
     */
    public ListNode reverseList1(ListNode head) {
        //排除特殊情况
        if (Objects.isNull(head) || Objects.isNull(head.next)) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (Objects.nonNull(curr)) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

}
