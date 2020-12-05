import java.util.Scanner;
public class count1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        for(int i=0;i<32;i++)
        {
            if(((n>>i)&1)==1)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
