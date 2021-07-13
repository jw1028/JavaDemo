import java.util.*;


public class Solution {


    public int[] twoSum (int[] numbers, int target) {
        // write code here
        if(numbers == null || numbers.length == 0) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            if(map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]) + 1, i + 1};
//                 return new int[]{i + 1, map.get(target - numbers[i]) + 1};
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
