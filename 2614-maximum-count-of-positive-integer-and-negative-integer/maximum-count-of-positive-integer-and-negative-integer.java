class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int min=0,max=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0) min++;
            else if(nums[i]>0) max++;
            else continue;
        }
        return Math.max(min,max);
    }
}