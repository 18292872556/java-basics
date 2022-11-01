package com.qxcto;

/**
 * 64.707
 */
public class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode();//带头结点
    }

//get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
    public int listSize(){
        ListNode cur = head.next;
        int count = 0;
        while(cur != null){
            cur = cur.next;
            count++;
        }
        return count;
    }
    public int get(int index) {
        if(index < 0 || index >= listSize()){
            return -1;
        }
        int i = 0;
        ListNode cur = head.next;
        while(i < index){
            cur = cur.next;
            i++;
        }
        return cur.val;
    }

//addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
    }

//addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = newNode;
    }

//addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。
// 如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
    public void addAtIndex(int index, int val) {
        if(index > listSize()){
            return;
        }

        ListNode cur = head;//保持在i的前驱结点
        int i = 0;
        ListNode newNode = new ListNode(val);
        //因为带头结点，所以统一处理
        if(index <= 0){
            newNode.next = head.next;
            head.next = newNode;
        }
        else{
            while(i < index){
                cur = cur.next;
                i++;
            }
            newNode.next = cur.next;
            cur.next = newNode;
        }

    }
//deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。

    public void deleteAtIndex(int index) {
        if(index >= listSize() || index < 0){
            return;
        }

        int i = 0;
        ListNode cur = head;
        while(i < index){
            cur = cur.next;
            i++;
        }

        cur.next = cur.next.next;

    }
    public void display(){
        ListNode cur = head.next;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}