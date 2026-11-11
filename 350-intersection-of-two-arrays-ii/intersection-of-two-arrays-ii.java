class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer>res=new ArrayList<>();
        int m=nums1.length;
        int n=nums2.length;
        int j=0,i=0;
        while(i<m && j<n){
                if(nums1[i]==nums2[j]){
                    res.add(nums1[i]);
                    j++;
                    i++;
                }
                else if(nums1[i]>nums2[j]){
                    j++;
                }
                else{
                    i++;
                }
        }
        int[]ans=new int[res.size()];
        int k=0;
        for(int ele:res){
            ans[k++]=ele;
        }
        return ans;
    }
}