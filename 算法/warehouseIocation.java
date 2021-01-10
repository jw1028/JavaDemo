import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
        int sum=0;
        int mid=n/2;
        for(int i=0;i<n;i++)
        {

            sum+=Math.abs((a[mid]-a[i]));
        }
        System.out.println(sum);
    }
}
