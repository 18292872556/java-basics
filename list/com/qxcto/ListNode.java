package com.qxcto;

public class ListNode {
    int val;
    ListNode next = null;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class Solution {
    //63.203移除链表元素
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = head;
        //判断头
        while(head != null){
            if(head.val == val){
                head = head.next;
            }else{
                break;
            }
        }
        cur = head;
        //此时cur在不为val的头结点，或头删完了，cur为null
        while(cur != null && cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }

    //63.203.2移除链表元素
    public ListNode removeElements2(ListNode head, int val) {
       if(head == null){
           return null;
       }
       head.next = removeElements2(head.next, val);
        return head.val == val? head.next:head;
    }
    //63.203.2移除链表元素
    public ListNode removeElements3(ListNode head, int val) {
        //设置dummyHead作为头结点
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while(cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }

        return dummyHead.next;
    }
}
