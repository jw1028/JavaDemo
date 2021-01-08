
public class TestList {
    public static void main(String[] args) {
        MySingnalList list = new MySingnalList();

        //头插法
        list.addFirst(3);
        list.addFirst(4);
        //尾插法
        list.addTail(1);
        list.addTail(2);
        //任意位置插入
        list.addIndex(0,1);
        list.addIndex(4,9);

        //打印
        list.display();
        System.out.println("=================");
        //查询key在单链表中吗
        System.out.println(list.contains(7));
        System.out.println("=================");
        //删除key
        list.remove(4);
        list.display();
        System.out.println("=================");
        //清空链表
//        list.clear();
//        list.display();
//        System.out.println("=================");
        //删除所有值为key的节点
        list.removeAllKey(1);
        list.display();
        //翻转单链表
//        list.insertTail(2);
        list.head = list.reverse();
        list.display();
        //查询中间
        Node mid = list.findMiddleNode();
        System.out.println(mid.data);
        list.display();
        //查询倒数第k个
        Node node = list.findLastK(3);
        System.out.println(node.data);
    }

}
