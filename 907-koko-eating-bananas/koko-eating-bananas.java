// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//        int low=1,high=0;
//        for(int ele:piles){
//         high=Math.max(high,ele);
//        }
//        while(low<=high){
//         int mid=low+(high-low)/2;
//         int hours=0;
//         for(int p:piles){
//             hours += (p + mid - 1) / mid;
//         }
//         if(hours<=h) hours=mid-1;
//         else low=mid+1;
//        }
//        return low;
//     }
// }

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;

        for (int ele : piles) {
            high = Math.max(high, ele);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int hours = 0;

            for (int p : piles) {
                hours += Math.ceil((double) p / mid);
            }

            if (hours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
