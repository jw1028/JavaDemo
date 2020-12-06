public class findOneNum {
    public static int findOneNum(int[] arr){
        int ret=0;
        for(int i=0;i<arr.length;i++)
        {
            ret^=arr[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] array={1,1,9,2,2,4,4,3,3};
        int ret=findOneNum(array);
        System.out.println(ret);
    }
}
