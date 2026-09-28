class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }/*
        if(nums.length==1)return;
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]!=0)i++;
            else if(nums[j]==0)j--;
            else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }*/
    }
}