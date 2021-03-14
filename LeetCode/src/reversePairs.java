class Solution {
    public int mergeSort(int[] nums,int low,int high){
        if(low>=high) return 0;
        int mid=low+high>>1;
        int ret=mergeSort(nums,low,mid)+mergeSort(nums,mid+1,high);
        int i=low,j=mid+1;
        int[] tmp=new int[high-low+1];
        int k=0;
        while(i<=mid&&j<=high)
        {
            if(nums[i]<=nums[j]) 
            {
                tmp[k++]=nums[i++];
            }else {
                 tmp[k++]=nums[j++]; 
                 ret+=mid-i+1;
            }
        }
        while(i<=mid) tmp[k++]=nums[i++];
        while(j<=high) tmp[k++]=nums[j++];
        int idx=low;
        for(int x:tmp)
        {
            nums[idx++]=x;
        }
        return ret;
    }
    public int reversePairs(int[] nums) {
       return mergeSort(nums,0,nums.length-1);
    }
}
