class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int i=0,j=0;
        int n=nums.length;
        int mid=n/2,count=0;
        
        while(j<n){
            if(nums[mid]==nums[j])count++;
            j++;
        }
        return count==1;
    }
}