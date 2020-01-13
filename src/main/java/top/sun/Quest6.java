package top.sun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by SunnyGrocery on 2020/1/12 21:36
 */
public class Quest6 {
    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        for (int i = 0; i < 4; i++) {
            temp.val = i;
            temp.next = new ListNode(-1);
            temp = temp.next;
        }
        System.out.println();
        temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
        ArrayList<Integer> integers = printListFromTailToHead(head);
        System.out.println(integers);
        integers = printListFromTailToHead(null);
        System.out.println(integers);
        integers = printListFromTailToHead(new ListNode(1));
        System.out.println(integers);
    }

    /**
     * public class ListNode {
     * int val;
     * ListNode next = null;
     * <p>
     * ListNode(int val) {
     * this.val = val;
     * }
     * }
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<>();
        }
        if (listNode.next == null) {
            return new ArrayList<>(Collections.singletonList(listNode.val));
        }
        LinkedList<Integer> stack = new LinkedList<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        return new ArrayList<>(stack);
    }
}

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}
