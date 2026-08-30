class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1 || n==0) return n;
        int minValue=0;
        int maxValue=0;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[maxValue]) maxValue=i;
            if(nums[i]<nums[minValue]) minValue=i;
        }
         int left = Math.min(minValue, maxValue);
        int right = Math.max(minValue, maxValue);

        int removeFromLeft = right + 1;
        int removeFromRight = n - left;
        int removeBoth = (left + 1) + (n - right);

        return Math.min(removeFromLeft,
                Math.min(removeFromRight, removeBoth));
    }
}