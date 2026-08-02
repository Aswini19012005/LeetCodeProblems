class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        return helper(nums,target,0,n-1);
    }
    public static int helper(int[]arr,int target,int low,int high){
        int mid=low+(high-low)/2;
        if(high<low) return -1;

        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return helper(arr,target,low,mid-1);
        else return helper(arr,target,mid+1,high);
            }
}