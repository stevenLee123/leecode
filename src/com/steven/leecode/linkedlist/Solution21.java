/**
 * @program: leecode
 * @description: 删除链表中的节点
 * @author: steven
 * @create: 2019-11-07 07:54
 **/
package com.steven.leecode.linkedlist;

public class Solution21 {
    public static void main(String[] args) {
        MySingleList list = new MySingleList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list.delete(3));
        System.out.println(list);

    }
}
