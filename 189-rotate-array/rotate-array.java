class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==1||n==0)return;
        int []res=new int[n];
        int j=0;
        k=k%n;
        for(int i=n-k;i<n;i++){
            res[j++]=nums[i];
        }
        int x=0;
        while(x<n-k){
            res[j++]=nums[x++];
        }
        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }
    }
}