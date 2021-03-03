import java.util.*;
public class Main {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int f1 = 0;
     int f2 = 1;
     int f3 = 0;
     while(f2 < n) {
         f3 = f1+f2;
         f1 = f2;
         f2 = f3;
     }
     int ret= (f2-n)<(n-f1)?(f2-n):(n-f1);
     System.out.println(ret);
  }
}