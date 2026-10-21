class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>res=new ArrayList<>();
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int ele:nums){
            mp.put(ele,mp.getOrDefault(ele,0)+1);
        }
        for(int ele:mp.keySet()){
            if(mp.get(ele)>nums.length/3){
                res.add(ele);
            }
        }
        return res;
    }}
        // int candidate=0;
        // int count=0;
        // for(int ele:nums){
        //     if(count==0){
        //         candidate=ele;
        //         res.add(ele);
        //     }
        //     if(candidate==ele)count++;
        //     else count--;

        // }
        // return res;
    