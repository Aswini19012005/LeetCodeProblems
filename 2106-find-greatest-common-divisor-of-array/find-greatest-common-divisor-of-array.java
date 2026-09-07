class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        return gcd(max,min);
    }
    public int gcd(int x,int y){
        int res=0;
        for(int i=1;i<=x&&i<=y;i++){
            if(x%i==0 &&y%i==0){
                res=i;
            }
        }
        return res;
    }
}