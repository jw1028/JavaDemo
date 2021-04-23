import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n > 1000) n = 999;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(i);
        }
        int i = 0;
        while(list.size() > 1) {
            i = (i + 2) % list.size();
            list.remove(i);
        }
        System.out.println(list.get(0));
    }
}
