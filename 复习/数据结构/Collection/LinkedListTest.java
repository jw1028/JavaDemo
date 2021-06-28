package 数据结构.Collection;

import java.util.LinkedList;

/**
 * 链表
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(null);
        list.addFirst(4);
        list.addLast(5);
        System.out.println(list);

    }
}
