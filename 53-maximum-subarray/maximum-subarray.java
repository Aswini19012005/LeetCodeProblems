class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int j=0;j<n;j++){
            currSum+=nums[j];
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0)currSum=0;
            }
        
        return maxSum;
    }
}