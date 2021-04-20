import java.util.*;
public class Main{
    public static String longStr(String str) {
        int max = 0, cnt = 0, end = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                cnt++;
                if(max < cnt) {
                    max = cnt;
                    end = i;
                }
            }else {
                cnt = 0;
            }
        }
        return str.substring(end - max + 1, end + 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String ret = longStr(s);
        System.out.print(ret);
    }
}
