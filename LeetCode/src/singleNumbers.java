//HashMap
class Solution {
    public int[] singleNumbers(int[] nums) {
     Map<Integer , Integer> map = new HashMap();
        for(int a : nums)
        {
            map.put(a , map.getOrDefault(a , 0) + 1);
        }
        int []res = new int[2];
        int index = 0;
        for(Map.Entry<Integer , Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                res[index++] = entry.getKey();
            }
        }
        return res;
    }
}
//异或
class Solution {
    public int[] singleNumbers(int[] nums) {
    //用于将所有的数异或起来
        int k = 0;
        
        for(int num: nums) {
            k ^= num;
        }
        //获得k中最低位的1
        int mask = 1;
        //mask = k & (-k) 这种方法也可以得到mask，具体原因百度 哈哈哈哈哈
        while((k & mask) == 0) {
            mask <<= 1;
        }
        int a = 0;
        int b = 0;     
        for(int num: nums) {
            if((num & mask) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }   
        return new int[]{a, b};
    }
}