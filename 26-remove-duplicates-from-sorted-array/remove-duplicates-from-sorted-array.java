class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
            }
                nums[i]=nums[j];
        }
            return i+1;        
            }
        // HashSet<Integer>ans=new HashSet<>();
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     ans.add(nums[i]);
        // }
        // return ans.size();
    
}