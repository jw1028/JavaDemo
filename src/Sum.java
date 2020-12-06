import java.util.Scanner;
public class Sum {
    public static int Sum(int n){
        if(n<9)
        {
            return n%10;
        }else{
            return n%10+Sum(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ret=Sum(n);
        System.out.println(ret);
    }

}
