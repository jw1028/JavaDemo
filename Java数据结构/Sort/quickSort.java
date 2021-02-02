import java.util.Arrays;
import java.util.Stack;

public class quickSort {
    //递归写法及其优化
    public static void quickSort1(int[] array){
        quick(array,0,array.length-1);
    }
    public static int pivot(int[] array,int low,int high) {
        int tmp = array[low];
        while (low < high) {
            while (array[high]>=tmp&&low<high) {
                high--;
            }
            //把high数据赋值给low
            array[low]=array[high];
            while (array[low]<=tmp&&low<high) {
                low++;
            }
            //把low下标的值给high
            array[high]=array[low];
        }
        array[low] = tmp;
        return low;
    }
    public static void insertSort(int[] array,int low,int high)
    {
        int tmp,j;
        for(int i=low;i<=high;i++)
        {
            tmp=array[i];
            j=i-1;
            for(;j>=low;j--)
            {
                if(array[j]>tmp)
                {
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }
    public static void quick(int[] array,int low,int high){
            if(low>=high) return ;
            if(high-low + 1 <= 50) {
                //使用插入排序
                insertSort(array,low,high);
                return;//记着这里一定要return  这里说明 这个区别范围有序了 直接结束
            }
            //优化1
            medianOfThree(array,low,high);
            int piv=pivot(array,low,high);
            quick(array,low,piv-1);
            quick(array,piv+1,high);
        }

    public static void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void medianOfThree(int[] array,int low,int high) {
        int mid = (low+high)/2;
        //array[mid] <= array[low] <= array[high]
        if(array[low] < array[mid]) {
            swap(array,low,mid);
        }//array[mid] <= array[low]
        if(array[low] > array[high]) {
            swap(array,low,high);
        }//array[low] <= array[high]
        if(array[mid] > array[high]) {
            swap(array,mid,high);
        }//array[mid] <= array[high]
    }

    //非递归写法
    public static void quickSort2(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int low = 0;
        int high = array.length-1;
        int piv = pivot(array,low,high);//
        if(piv > low + 1) {
            stack.push(low);
            stack.push(piv-1);
        }
        if(piv < high-1) {
            stack.push(piv+1);
            stack.push(high);
        }
        while (!stack.empty()) {
            high = stack.pop();
            low = stack.pop();
            piv = pivot(array,low,high);
            if(piv > low + 1) {
                stack.push(low);
                stack.push(piv-1);
            }
            if(piv < high-1) {
                stack.push(piv+1);
                stack.push(high);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10,3,2,7,19,78,65,127};
        System.out.println(Arrays.toString(array));
        quickSort1(array);
         //quickSort2(array);
        System.out.println(Arrays.toString(array));
    }
}
