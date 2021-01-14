import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
         int[] arr=new int[n+1];
         int max = 0;
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
            max = Math.max(max, arr[i]);
        }
        double left=0;
        double right=max;
        while((right-left)>0.001) {
            double mid = (left + right) / 2;
            int count=0;
            for(int i=0;i<n;i++)
            {
                count+=(int)arr[i]/mid;
            }
            if (count>=m) {
                left = mid;
            } else {
                right = mid;
            }
        }
        System.out.printf("%.2f\n",right);

    }
}