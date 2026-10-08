class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int j=0;j<m.length();j++){
            char y=m.charAt(j);
            mp.put(y,mp.getOrDefault(y,0)+1);

        }
        for(int i=0;i<r.length();i++){
            char x=r.charAt(i);
            if(!mp.containsKey(x)||mp.get(x)==0) return false;
            mp.put(x, mp.get(x) - 1);

        }
        
        return true;
    }
}