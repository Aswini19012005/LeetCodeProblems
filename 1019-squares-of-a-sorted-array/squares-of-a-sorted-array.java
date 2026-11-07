class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=0;j<n;j++){
            nums[j]=nums[j]*nums[j];
        }
        Arrays.sort(nums);

        return nums;
    }
}