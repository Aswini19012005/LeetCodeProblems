class Solution {
    public String reverseWords(String s) {
        String[] flag = s.trim().split("\\s+");
        int i=0,j=flag.length-1;
        while(i<j){
            String temp=flag[i];
            flag[i]=flag[j];
            flag[j]=temp;
            i++;j--;
        }
        String res=String.join(" ",flag);
        return res;
    }
}