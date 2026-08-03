class Solution {

    public List<String> generateParenthesis(int n) {
     List<String>ans=new ArrayList<>();
     generate(n,0,0,"",ans);
     return ans;
    }
    public void generate(int n,int li,int r,String s,List<String> l){
        if(r==n){
            l.add(s);
            return;
        }
        if(li < n) generate(n,li+1,r,s+"(",l);
        if(r<li) generate(n,li,r+1,s+")",l);


    }
}