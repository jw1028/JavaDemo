// 和为s的两个数字
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return null;
        }
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int sum = nums[i] + nums[j];
            if(sum < target) {
                i++;
            }else if(sum > target) {
                j--;
            }else {
                return new int[]{nums[i],nums[j]};
            }
        }
        return new int[0];
    }
}

// 数组中重复的数字
class Solution {
    public int findRepeatNumber(int[] nums) {
        if(nums == null ||nums.length == 0) {
            return 0;
        }
      for(int i = 0; i < nums.length; i++) {
          if(nums[i] != i) {
              if(nums[i] == nums[nums[i]]) {
                  return nums[i];
              }else {
                  int tmp = nums[i];
                  nums[i] = nums[tmp];
                  nums[tmp] = tmp;
              }
          }
      }
      return -1;
    }
}
//数组中出现次数超过一般的数字
class Solution {
    public int majorityElement(int[] nums) {
        if(nums == null ||nums.length == 0) {
            return 0;
        }
        int len = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }else {
                map.put(nums[i], 1);
            }
            if(i >= len && map.get(nums[i]) > len) {
                return nums[i];
            }
        }
        return -1;
    }
}
//最长不含重复字符串的子串
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int ret = 0, left = 0;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
                map.put(s.charAt(i), i);
                ret = Math.max(ret, i - left + 1);
            
        }
        return ret;
    }
}
//连续子数组的最大和
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int ret = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            ret = Math.max(ret, nums[i]);
        }
        return ret;
    }
}

//最长公共子序列
class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int[][] f = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i - 1) != s2.charAt(j - 1)) {
                    f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
                }else {
                    f[i][j] = Math.max(f[i][j], f[i - 1][j - 1] + 1);
                }
            }
        }
        return f[n][m];
    }
}
//数组中数字出现的次数

class Solution {
    public int[] singleNumbers(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }else {
                map.put(nums[i], 1);
            }
        }
        int[] ret = new int[2];
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == 1) {
                ret[index++] = nums[i];
            }
        }
        return ret;
    }
}
//全排列
class Solution {
    public List<List<Integer>> ret = new ArrayList<>();
    public List<Integer> path = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        if(nums == null ||nums.length == 0) {
            return ret;
        }
        int n = nums.length;
        boolean[] used = new boolean[n];
        dfs(nums, n, 0, used, ret, path);
        return ret;
    }
    public void dfs(int[] nums, int len, int depth, boolean[] used, List<List<Integer>> ret,
    List<Integer> path) {
        if(len == depth) {
            ret.add(new ArrayList<>(path));
        }
        for(int i =- 0; i < len; i++) {
            if(!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, len, depth + 1, used, ret, path);
                used[i] = false;
                path.remove(path.size()  - 1);
            }
        }
    }
}
//顺时针打印链表
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int n = matrix.length, m = matrix[0].length;
        int[] ret = new int[n * m];
        boolean[][] used = new boolean[n][m];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = 0, y = 0, d = 1;
        for(int i = 0; i < n * m; i++) {
            ret[i] = matrix[x][y];
            used[x][y] = true;
            int a = x + dx[d];
            int b = y + dy[d];
            if(a < 0 || a >= n || b < 0 || b >= m || used[a][b]) {
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }
        return ret;
    }
}
