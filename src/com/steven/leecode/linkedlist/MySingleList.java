/**
 * @program: leecode
 * @description: 单向链表简单实现，不考虑多线程情况
 * @author: steven
 * @create: 2019-11-07 08:02
 **/
package com.steven.leecode.linkedlist;

import java.util.LinkedList;

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

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
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
    private ListNode last;

    public void add(T t){
        ListNode tmp = new ListNode(t);
        if(header  == null){
            header = tmp;
            last = tmp;
        } else {
            last.next = tmp;
            last = tmp;
        }
        size++;
    }
    public int delete(T t){
        if(header.getValue() == t){
            if(size == 1){
                header = null;
            }else {
                header = header.next;
            }
            size --;
            return 0;
        }
        int index = 0;
        ListNode preTmp = header;
        ListNode tmp = header.getNext();
        while (tmp != null) {
            if(tmp.getValue() == t){
                if(tmp.getNext() == null){
                    preTmp.next = null;
                    last = preTmp;
                }else{
                    preTmp.next = tmp.next;
                    tmp = null;
                    size -- ;
                    return index;
                }
            }
            index++;
            tmp = tmp.getNext();

        }
        return -1;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        ListNode tmp = header;
        while (tmp !=null){
            stringBuilder.append(tmp.getValue()+",");
            tmp = tmp.getNext();
        }
        stringBuilder.append("]");
        return stringBuilder.replace(stringBuilder.lastIndexOf(","),stringBuilder.lastIndexOf(",")+1,"").toString();
    }
}
