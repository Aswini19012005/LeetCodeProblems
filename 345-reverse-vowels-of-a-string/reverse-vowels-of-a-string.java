class Solution {
    public static String reverseVowels(String s) {
        int i=0, j=s.length()-1;
        char[] arr = s.toCharArray();
        while(i<j){
            if(!isVowel(arr[i])) i++;
            else if(!isVowel(arr[j])) j--;
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' || ch == 'A' ||
               ch == 'E' || ch == 'I' || ch == 'O' ||
               ch == 'U';
    }

}