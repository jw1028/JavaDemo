//和为s的两个数字
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] arr,int sum) {
        ArrayList<Integer> ret = new ArrayList<>();
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] + arr[j] < sum) {
                i++;
            }else if(arr[i] + arr[j] > sum) {
                j--;
            }else {
                ret.add(arr[i]);
                ret.add(arr[j]);
                break;
            }
        }
        return ret;
    }
}
