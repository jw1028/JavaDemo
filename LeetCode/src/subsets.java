class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ret = new ArrayList<>();
        ret.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
           int all = ret.size();
            for (int j = 0; j < all; j++) {
                List<Integer> tmp = new ArrayList<>(ret.get(j));
                tmp.add(nums[i]);
                ret.add(tmp);
            }
        }
        return ret;
    }
}