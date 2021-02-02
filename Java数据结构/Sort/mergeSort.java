import java.util.Arrays;

public class mergeSort {
    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length-1);
    }

    public static void mergeSortInternal(int[] array,int low,int high){
        if(low>=high) return ;
        int mid=(low+high)/2;
        //分解
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        //合并
        merge(array,low,mid,high);
    }

    //核心：两数组进行合并
    public static void merge(int[] array,int start,int mid,int end){
        int s1=start;
        int s2=mid+1;
        int[] tmp=new int[end-start+1];
        int k=0;
        while(s1<=mid&&s2<=end)
        {
            if(array[s1]<=array[s2])
            {
                tmp[k++]=array[s1++];
            }else{
                tmp[k++]=array[s2++];
            }
        }
        //有可能第一个段还有数据 有可能第2个段也有数据
        while(s1<=mid)
        {
            tmp[k++]=array[s1++];
        }
        while(s2<=end)
        {
            tmp[k++]=array[s2++];
        }
        for(int i=0;i<end-start+1;i++)
        {
            //一定要加上start
            array[i+start]=tmp[i];
        }
    }
    //非递归版本
    public static void mergeSort2(int[] array) {
        for (int i = 1; i < array.length; i*=2) {
            merge(array,i);
        }
    }

    public static void merge(int[] array,int gap) {
        int s1 = 0;
        int e1 = s1+gap-1;
        int s2 = e1+1;
        int e2 = s2+gap-1 < array.length ? s2+gap-1 : array.length-1;
        int[] tmp = new int[array.length];
        int k = 0;//下标
        //当有两个归并段的时候
        while (s2 < array.length) {
            //当当有两个归并段 且 这两个段内都要数据
            while (s1 <= e1 && s2<= e2) {
                if(array[s1] <= array[s2]) {
                    tmp[k++] = array[s1++];
                }else{
                    tmp[k++] = array[s2++];
                }
            }
            while (s1 <= e1) {
                tmp[k++] = array[s1++];
            }
            while (s2 <= e2){
                tmp[k++] = array[s2++];
            }
            //从这里开始的时候，每个下标都可能越界
            s1 = e2+1;
            e1 = s1+gap-1;
            s2 = e1+1;
            e2 = s2+gap-1 < array.length ? s2+gap-1 : array.length-1;
        }
        //退出上面循环后，
        // 那么把s1段内的数据给拷贝下来,因为 有可能e1已经越界了
        while (s1 < array.length) {
            tmp[k++] = array[s1++];
        }

        //拷贝tmp到原数组当中
        for (int i = 0; i < tmp.length; i++) {
            array[i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        int[] array = { 27,15,19,18,28,34,65,49,25,37};
        System.out.println(Arrays.toString(array));
        // mergeSort(array);
        mergeSort2(array);
        System.out.println(Arrays.toString(array));
    }
}
