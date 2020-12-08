
public class Swap {
    public static void swap(int[] array2) {
        int tmp = array2[0];
        array2[0] = array2[1];
        array2[1] = tmp;
    }
    public static void main13(String[] args) {
        //引用类型  引用 ： 指针：引用实际上就是一个变量
        //用来存储地址
        int[] array = {10,20};
        System.out.println(array[0]+" "+array[1]);
        swap(array);
        System.out.println(array[0]+" "+array[1]);
    }
}
