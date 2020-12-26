import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int arr1[]= {9,8,7,6,5,4,3,2,1};
        int arr2[]= {1,2,3,4,5,6,7,8,9};
        int temp=0;
        System.out.println("交换前");
        System.out.println("arr1[]="+ Arrays.toString(arr1));
        System.out.println("arr2[]="+Arrays.toString(arr2));
        for(int i=0;i<arr1.length;i++) {
            temp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;
        }
        System.out.println("交换前");
        System.out.println("arr1[]="+Arrays.toString(arr1));
        System.out.println("arr2[]="+Arrays.toString(arr2));
    }
}
