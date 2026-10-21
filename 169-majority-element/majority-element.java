class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        //     if (map.get(num) > nums.length / 2) {
        //         return num;
        //     }
        // }
        // return -1; 
        int n=nums.length;
        int count=0;
        int res=0;
        for(int i=0;i<n;i++){
            if(count==0){
                res=nums[i];
            }
            if(nums[i]==res)count++;

            else count--;
        }
        return res;
    }
}