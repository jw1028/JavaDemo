package 数据结构.Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 队列
 * 先进先出
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        PriorityQueue<Integer> bigHeap = new PriorityQueue<>(((o1, o2) ->o1 - o2 ));
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        for(int i = 0; i < arr.length;i++)
        {
            bigHeap.offer(arr[i]);
            if(bigHeap.size() > 3)
            {
                bigHeap.poll();
            }
        }
        System.out.println(bigHeap);

    }
}
