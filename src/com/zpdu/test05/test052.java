package com.zpdu.test05;

public class test052 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode();
        ListNode p = listNode;
        while (list1 != null || list2 != null) {
            if (list1.val <= list2.val) {
                p.next = new ListNode(list1.val);
                list1 = list1 == null ? null : list1.next;
            } else {
                p.next = new ListNode(list2.val);
                list2 = list2 == null ? null : list1.next;

            }
        }
        return listNode.next;


    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }
}
