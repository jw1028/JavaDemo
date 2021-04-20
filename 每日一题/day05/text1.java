import java.util.*;
public class Main{
    public static int cntHuiWen(String a, String b) {
        int cnt = 0;
        for(int i = 0; i < a.length(); i++) {
            String str = a.substring(0, i) + b + a.substring(i, a.length());
            if(reverse(str).equals(str)) {
                cnt++;
            }
        }
        return cnt;
    }
    public static String reverse(String s) {
        String ret = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            ret += s.charAt(i);
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        System.out.print(cntHuiWen(a, b));
    }
}
