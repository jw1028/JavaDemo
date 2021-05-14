import java.util.*;
public class Main{
    static Scanner scan = new Scanner(System.in);
    public static boolean func(int n) {
        int sum = 0;
        for(int i = 1; i <= n / 2; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        if(sum == n) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        while(scan.hasNext()) {
            int n = scan.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(func(i)) {
                count++;
            }
        }
        System.out.println(count);
        } 
    }
}
