import java.sql.SQLOutput;

/**
 * Created with Intellig IDEA
 * Description:
 * User: zjc
 * Date: 2020- 12 -09
 * Time: 22:58
 */
public class printArray {
    public static void print(int[] array){
    for(int i=0;i<array.length;i++)
    {
        System.out.print(array[i]+" ");
    }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        print(array);
    }
}
