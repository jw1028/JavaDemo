
import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i = 1;i<=300;i++){
            String a = Integer.toString(i,n).toUpperCase();
            String b = Integer.toString(i*i,n).toUpperCase();
            String c = new StringBuffer(b).reverse().toString();
            if(b.equals(c)){
                System.out.println(a + " " + b);
            }
        }
    }
}