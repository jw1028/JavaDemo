import java.util.Scanner;
public class Fibonacci {
    //迭代实现
   /* public static int Fib(int n){
        int a=1;
        int b=1;
        int c=0;
        if(n==1||n==2)
        {
            return 1;
        }else{
            for(int i=3;i<=n;i++)
            {
                c=a+b;
                a=b;
                b=c;
            }
            return c;
        }
    }*/
    //递归实现
    public static int Fib(int n)
    {
        if(n==1||n==2)
        {
            return 1;
        }else{
            return Fib(n-1)+Fib(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ret=Fib(n);
        System.out.println(ret);
    }
}
