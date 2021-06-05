// write your code here
import java.util.*;
public class Main{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while(scan.hasNext()) {
            String str = scan.nextLine();
            StringBuilder ret = new StringBuilder();
            for(char x : str.toCharArray()) {
                if(Character.isDigit(x)) {
                    ret.append(x);
                }
            }
            System.out.println(ret.toString());
        }
    }
}
