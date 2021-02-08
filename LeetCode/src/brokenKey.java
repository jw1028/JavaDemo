import java.util.*;
public class Main{
    public static void  func(String strAct,String strExc){
        HashSet<Character> setAct=new HashSet<>();
        for(char ch:strAct.toUpperCase().toCharArray())
        {
            setAct.add(ch);
        }
         HashSet<Character> setBroken=new HashSet<>();
        for(char ch:strExc.toUpperCase().toCharArray())
        {
            if(!setAct.contains(ch)&&!setBroken.contains(ch))
            {
                setBroken.add(ch);
                System.out.print(ch);
            }
        }
    }
   
    public static void main(String[] args)
    {
        
        Scanner scan=new Scanner(System.in);
        String strExc=scan.nextLine();
        String strAct=scan.nextLine();
        func(strAct,strExc);
    }
}