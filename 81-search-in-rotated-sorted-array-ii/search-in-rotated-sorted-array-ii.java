// class Solution {
//     public boolean search(int[] arr, int target) {
//         // int low=0,high=nums.length-1;
//         // while(low<=high){
//         //     int mid=low+(high-low)/2;
//         //     if(arr[mid]==target)
//         //       return false;
            
//         //     if(arr[])
//         int n=arr.length;
//         int i=0,j=n-1;
//         while(i<=j){
//             int mid=i+(j-i)/2;
//             if(arr[mid]==target)return true;

//             if(arr[mid]==arr[i]&&arr[mid]==arr[j]){
//                 i++;
//                 j--;
//             }
//             //if left half is sorted
//              if(arr[i]<=arr[mid]){
//                 if(arr[i]<=target &&target<arr[mid]){
//                     j=mid-1;
//                 }
//                 else{
//                     i=mid+1;
//                 }
//              }
//                 //right half is sorted

//              else{
//                 if(arr[mid]<target &&target<=arr[j]){
//                     i=mid+1;
//                 }
//                 else{
//                     j=mid-1;
//                 }
//              }
//         }
//     return false;
//     }
// }

class Solution {
    public boolean search(int[] arr, int target) {
        int i = 0, j = arr.length - 1;

        while(i <= j) {
            int mid = i + (j - i) / 2;

            if(arr[mid] == target) return true;

            // Ambiguous case due to duplicates
            if(arr[i] == arr[mid] && arr[mid] == arr[j]) {
                i++;
                j--;
            }

            // Left half is sorted
            else if(arr[i] <= arr[mid]) {
                if(arr[i] <= target && target < arr[mid]) {
                    j = mid - 1;
                }
                else {
                    i = mid + 1;
                }
            }

            // Right half is sorted
            else {
                if(arr[mid] < target && target <= arr[j]) {
                    i = mid + 1;
                }
                else {
                    j = mid - 1;
                }
            }
        }

        return false;
    }
}
