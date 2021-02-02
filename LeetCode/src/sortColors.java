class Solution {

  public static int pivot(int[] array,int low,int high){
        int tmp=array[low];
        while(low<high)
        {
            while(array[high]>=tmp&&low<high)
            {
                high--;
            }
            array[low]=array[high];
            while(array[low]<=tmp&&low<high)
            {
                low++;
            }
            array[high]=array[low];
        }
        array[low]=tmp;
        return low;
    }

    public static void quick(int[] array,int low,int high){
        if(low>=high) return ;
        int piv=pivot(array,low,high);
        quick(array,low,piv-1);
        quick(array,piv+1,high);

    }
    public void sortColors(int[] nums) {
     quick(nums,0,nums.length-1);
    }
}