import java.io.PrintStream;
import java.util.Scanner;

public class Main {
 public static Scanner in = new Scanner(System.in);
 public static PrintStream out = System.out;

 public static int findCoin(int n){
  if(n==1)
   return 0;
  if(n<=3)
   return 1;
  int metage,rest,times=0;
  // 3等分前，先加2，使得metage的值尽量大于rest
  // (metage,metage,rest)
  metage = (n+2)/3;
  rest = n-2*metage;

  times= 1 + findCoin(Math.max(metage, rest));
  return times;
 }
 public static void main(String[] args) {
  int n;
  while((n=in.nextInt()) > 0){
   out.println(findCoin(n));
  }
 }
}
