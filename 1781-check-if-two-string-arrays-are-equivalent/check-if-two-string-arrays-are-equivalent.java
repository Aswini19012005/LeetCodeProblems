class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String x="";
        String y="";
        for(String ele:word1) x+=ele;
        for(String ele:word2) y+=ele;

        return x.equals(y);
    }
}