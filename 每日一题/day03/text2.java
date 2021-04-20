import java.util.*;
public class Solution {
  public int MoreThanHalfNum_Solution(int [] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
      int len = nums.length/2;
      for(int i = 0; i < nums.length; i++){
    if(map.containsKey(nums[i])){
      map.put(nums[i], map.get(nums[i]) + 1);
     }else{
        map.put(nums[i], 1);
          }
      if(i >= len && map.get(nums[i]) > len) return nums[i];
     }
    return 0;
  }
}
