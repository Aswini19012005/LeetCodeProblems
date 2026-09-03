class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int flag=x;
        int sum=0;
        while(x>0){
            int temp=x%10;
            sum+=temp;
            x/=10;
        }
        if(flag%sum==0) return sum;
        else return -1;
    }
}