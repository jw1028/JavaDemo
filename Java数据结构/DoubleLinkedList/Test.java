public class Test {

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        //头插
        doubleLinkedList.addFirst(1);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(3);

        //尾插
        doubleLinkedList.addLast(4);
        doubleLinkedList.addLast(5);

        //任意位置插入
        doubleLinkedList.addIndex(3,666);
        doubleLinkedList.display();//3 3 2 1 666 4 5
        //是否包含某个元素
        System.out.println(doubleLinkedList.contains(6));
        //长度
        System.out.println(doubleLinkedList.size());
        //删除元素
        doubleLinkedList.removeAllKey(3);
        doubleLinkedList.display();// 2 1 666 4 5
        doubleLinkedList.clear();
        System.out.println("==================");
    }
}