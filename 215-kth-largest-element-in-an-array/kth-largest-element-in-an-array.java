class Solution {
    public int findKthLargest(int[] nums, int k) {
      //using inbuilt sort
      /*
      Arrays.sort(nums);
      int n=nums.length;
      return nums[n-k];  */

      //using min-heap
      int n=nums.length;
      PriorityQueue<Integer>hp=new PriorityQueue<>();
      for(int i=0;i<n;i++){
        hp.add(nums[i]);
        if(hp.size()>k) hp.remove();
      }
      return hp.peek();
    }
}