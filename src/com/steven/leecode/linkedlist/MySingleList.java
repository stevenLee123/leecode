/**
 * @program: leecode
 * @description: 单向链表简单实现，不考虑多线程情况
 * @author: steven
 * @create: 2019-11-07 08:02
 **/
package com.steven.leecode.linkedlist;

public class MySingleList<T> {
    private class ListNode{
        public T value;
        public ListNode next;

        public ListNode(T value) {
            this.value = value;
        }

        public ListNode(T value, ListNode next) {
            this.value = value;
            this.next = next;
        }

    }
    public MySingleList() {
    }

    public MySingleList(ListNode header) {
        this.header = header;
    }

    private int size;
    private ListNode header;
    private ListNode end;

    public void add(T t){

    }
    public void delete(T t){

    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    @Override
    public String toString() {
        return "MySingleList{}";
    }
}
