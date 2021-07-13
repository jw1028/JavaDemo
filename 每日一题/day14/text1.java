class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int x : nums) {
            minheap.offer(x);
            if(minheap.size() > k) {
                minheap.poll();
            }
        }
        return minheap.peek();
    }
}
