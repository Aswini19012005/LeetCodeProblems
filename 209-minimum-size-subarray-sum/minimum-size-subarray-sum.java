// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         // HashMap<Integer,Integer>mp=new HashMap<>();
        
//         // int n=nums.length;
//         // for(int i=0;i<n;i++){
//         //     int comp=target-nums[i];
//         //     if(mp.containsKey(comp))
//         // }
//         int left=0,sum=0,res=Integer.MAX_VALUE;
//         for(int right=0;right<nums.length;right++){
//             sum+=nums[right];
//             while(sum<=target){
//                 int len=right-left+1;
//                 res=Math.min(res,len);
//                 sum-=nums[left];
//                 left++;
//             }
//         }
//         return res == Integer.MAX_VALUE ? 0 : res;
//     }
// }

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                int len = right - left + 1;
                minLen = Math.min(minLen, len);

                sum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
