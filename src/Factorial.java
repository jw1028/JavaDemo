import java.util.Scanner;
public class Factorial {
         //迭代实现
        /* public static int Factorial(int n){
             int sum=1;
             for(int i=1;i<=n;i++)
             {
                 sum*=i;
             }
             return sum;
         }*/
         //递归实现
        public static int Factorial(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n * Factorial(n - 1);
            }

        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int ret = Factorial(n);
            System.out.println(ret);
        }
}
