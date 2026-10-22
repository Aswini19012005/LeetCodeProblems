class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        for(int ele:nums1){
            set.add(ele);
        }
        Set<Integer>res=new HashSet<>();
        for(int ele:nums2){
            if(set.contains(ele)){
                res.add(ele);
            }
        }
        int[]ans=new int[res.size()];
        int k=0;
        for(int ele:res){
            ans[k++]=ele;
        }
        return ans;


        // int n1=nums1.length;
        // int n2=nums2.length;
        // int i=0,j=0;

        // HashSet<Integer>st=new HashSet<>();
        // while(i<n1 && j<n2){
        //     if(nums1[i]==nums2[j]){
        //         st.add(nums1[i]);
                
        //     }
        //     i++;j++;
        // }
        // int[]res=new int[st.size()];
        // int k=0;
        // for(int ele:st){
        //     res[k++]=ele;
        // }
        // return res;
    }
}