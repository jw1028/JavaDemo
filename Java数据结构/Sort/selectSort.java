import java.util.Arrays;

public class selectSort {
    public static void selectSort(int[] array) {
         for(int i=0;i<array.length-1;i++)
         {
             for(int j=i+1;j<array.length;j++)
             {
                 if(array[j]<array[i])
                 {
                     int tmp=array[i];
                     array[i]=array[j];
                     array[j]=tmp;
                 }
             }
         }
    }
    public static void main(String[] args) {
        int[] array={2,6,7,4,7,3,9,8};
        System.out.println(Arrays.toString(array));
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
