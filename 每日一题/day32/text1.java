import java.util.*;
public class Main{
    static int[] fib = new int[100001];
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        fib[0] = 1;
        fib[1] = 1;
        while(scan.hasNext()) {
            int n = scan.nextInt();
            System.out.printf((n < 25 ? "%d\n" : "%06d\n"), getFib(n));
            
        }
    }
    static int getFib(int n) {
        if(fib[2] == 0) {
            for(int i = 2; i < 100001; i++) {
                fib[i] = (fib[i - 1] + fib[i - 2]) % 1000000;
            }
        }
        return fib[n];
    }
}
