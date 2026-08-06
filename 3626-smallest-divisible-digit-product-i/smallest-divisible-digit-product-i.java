class Solution {
    public int smallestNumber(int n, int t) {
        int res=-1;
       for(int i=n;i<=100;i++){
        if(product(i)%t==0){
            res=i;
            break;  
        }
       }
       return res;
       
    }
    public int product(int n){
        int prod=1;
        while(n>0){
            int digit=n%10;
            prod*=digit;
            n/=10;
        }
        return prod;
    }
}