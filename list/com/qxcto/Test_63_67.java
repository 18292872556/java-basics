package com.qxcto;


public class Test_63_67 {

    public static void main(String[] args){
        //63.
        //64.设计链表
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        linkedList.display();

        System.out.println( linkedList.get(1));//返回2
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        linkedList.display();
        System.out.println(linkedList.get(1));//返回3



    }

}
