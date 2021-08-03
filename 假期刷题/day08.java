//把数组排成最小的数
class Solution {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (x, y)-> (x + y).compareTo(y + x));
        StringBuffer ret = new StringBuffer();
        for(String s : strs) {
            ret.append(s);
        }
        return ret.toString();
    }
}
