package 数据结构.Collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 顺序表
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        /**
         * 尾插法
         * 可以添加null，但在取元素是需要判断
         */
        list.add(1) ;
        list.add(2) ;
        list.add(2, null) ;
        list.add(4) ;
        for(int i = 0; i < list.size(); i++){
            //此处要进行空指针判断，
            //避免调用错误
            if(list.get(i) != null){
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();
        /**
         * 删除指定元素时只能用迭代器来删
         */
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            Integer num = it.next();
            if(num != null) {
                if(num == 4) {
                    it.remove();
//                list.remove(num);会报错
                }
            }
        }
        System.out.println(list);


        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = i;
        }


    }
}
