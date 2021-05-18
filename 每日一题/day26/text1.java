import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        while(scan.hasNext()){
            BigInteger a = scan.nextBigInteger();
            BigInteger b = scan.nextBigInteger();
            BigInteger c = scan.nextBigInteger();
            if(a.add(b).compareTo(c) > 0 && a.add(c).compareTo(b )> 0 && b.add(c).compareTo(a) > 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
