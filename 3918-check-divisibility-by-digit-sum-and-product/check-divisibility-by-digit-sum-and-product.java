class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int n1=n;
        while(n1>0){
            int temp=n1%10;
            sum+=temp;
            prod*=temp;
            n1/=10;
        }
        int totalSum=sum+prod;
        if(n%totalSum==0) return true;
        else return false;

    }
}