import java.util.Arrays;

public class shellSort {

    public static void shellSort(int[] array) {
        int[] drr = {5,3,1};//增量数组
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }

    public static void shell(int[] array ,int gap) {
      int j,tmp;
      for(int i=gap;i<array.length;i++)
      {
          tmp=array[i];
          j=i-gap;
          for(;j>=0;j-=gap)
          {
              if(array[j]>tmp)
              {
                  array[j+gap]=array[j];
              }else{
                  break;
              }
          }
          array[j+gap]=tmp;
        }
    }
    
    public static void main(String[] args) {
        int[] array={2,6,7,4,4,7,7,3,3,7,7};
        System.out.println(Arrays.toString(array));
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
