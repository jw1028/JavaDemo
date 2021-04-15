import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        char[] ch1 = s1.toCharArray();
        String s2 = scan.nextLine();
        for(int i = 0; i < ch1.length; i++) {
            if(!s2.contains(String.valueOf(ch1[i]))) {
                System.out.print(ch1[i]);
            }
        }
    }
}
