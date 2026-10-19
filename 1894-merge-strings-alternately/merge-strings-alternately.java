class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder res=new StringBuilder();
        int i=0,j=0;
        while(i<w1.length() && j<w2.length()){
            char ch1=w1.charAt(i);
            char ch2=w2.charAt(j);
            res.append(ch1);
            res.append(ch2);
            i++;
            j++;
        }
            
        while(i<w1.length()){
            char ch1=w1.charAt(i);
            //char ch2=w2.charAt(j);
            res.append(ch1);
            i++;
        }
        while(j<w2.length()){
           // char ch1=w1.charAt(i);
            char ch2=w2.charAt(j);
            res.append(ch2);
            j++;
        }


        return res.toString();
    }
}