import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        int ret = n > m ? n : m;
        while(true) {
            if(ret % n ==0 && ret % m == 0) {
                System.out.print(ret);
                break;
            }
            ret++;
        }
    }
}
