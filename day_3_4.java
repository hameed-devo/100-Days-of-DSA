import java.util.PriorityQueue;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for(int val: nums){
            minheap.add(val);
            if(minheap.size() > k){
                minheap.poll();
            }
        }
        return minheap.peek();
    }
}