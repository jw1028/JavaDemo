import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++) {
            arr[i] = scan.nextInt();
        }
        if(arr[0] + arr[1] + arr[3] == arr[2]) {
            int A = (arr[0] + arr[2]) / 2;
            int B = arr[0] - A;
            int C = arr[3] - B;
            System.out.print(A +" "+ B + " " + C);
        }else {
            System.out.print("No");
        }
    }
}
