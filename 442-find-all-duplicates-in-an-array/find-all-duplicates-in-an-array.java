class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        List<Integer>res=new ArrayList<>();
        for(int ele:nums){
            mp.put(ele,mp.getOrDefault(ele,0)+1);
        }
        for(int i:mp.keySet()){
            if(mp.get(i)>=2)res.add(i);
        }
        return res;
    }
}