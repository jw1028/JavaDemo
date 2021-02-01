import java.util.Arrays;

public class bubbleSort {
    public static void bullSort(int[] array){
        for(int i=0;i<array.length;i++)
        {
            int flag=0;
            for(int j=0;j<array.length-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {10,3,2,7,19,78,65,127};
        System.out.println(Arrays.toString(array));
        bullSort(array);
        System.out.println(Arrays.toString(array));
    }
}
