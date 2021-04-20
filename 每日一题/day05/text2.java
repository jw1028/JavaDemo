import java .util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i]+=Math.max(arr[i-1],0);
            max=Math.max(arr[i],max);
        }
        System.out.print(max);
    }
}
