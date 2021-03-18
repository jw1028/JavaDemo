//整数二分
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int q = Integer.parseInt(s[1]);
        String[] string = reader.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(string[i]);
        }
        for(int i=0;i<q;i++) {
            int k = Integer.parseInt(reader.readLine());
            int l = 0, r = n-1;
            while(l<r)
            {
                int mid=l+r>>1;
                if(arr[mid]>=k) r=mid;
                else l=mid+1;
                
            }
            if(arr[l]!=k) System.out.println("-1 -1");
            else{
                System.out.print(l+" ");
                l=0;r=n-1;
                while(l<r)
                {
                    int mid=l+r+1>>1;
                    if(arr[mid]<=k) l=mid;
                    else r=mid-1;
                }
                 System.out.println(l);
            }
        }
    }

}
