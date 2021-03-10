import java.util.ArrayList;
import java.util.Scanner;

public class JosephRing {
  //模拟实现
    public static  int josephRing1(int n,int m){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(i);
        }
        int idx=0;
        while(n>1)
        {
            idx=(idx+m-1)%n;
            list.remove(idx);
            n--;
        }
        return list.get(0);
    }
  //递推实现
    public static int josephRing2(int n,int m){
        if(n==1) return 0;
        return (josephRing2(n-1,m)+m)%n;
    }
  //测试
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        System.out.println(josephRing1(n,m));
        System.out.println(josephRing2(n, m));
    }
}
