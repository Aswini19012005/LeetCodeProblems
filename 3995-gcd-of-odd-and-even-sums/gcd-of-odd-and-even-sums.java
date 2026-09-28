class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==1)return 1;
        int evenSum=n*(n+1);
        int oddSum=n*n;
        return gcd(evenSum,oddSum);
    }
    int gcd(int x,int y){
        int res=0;
        for(int i=1;i<x&&i<y;i++){
            if(x%i==0 && y%i==0)res=i;
        }
        return res;
    }
}