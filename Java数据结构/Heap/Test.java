import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array={ 27,15,19,18,28,34,65,49,25,37 };

        System.out.println(Arrays.toString(array));
        Heap heap=new Heap();
        heap.createBigHeap(array);
        heap.show();
        heap.offer(100);
        heap.show();
        System.out.println(heap.poll());
        System.out.println(heap.peek());
    }
}
