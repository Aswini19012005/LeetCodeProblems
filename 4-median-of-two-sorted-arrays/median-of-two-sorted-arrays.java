import  java.util.*;
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] nums=mergeSort(nums1,m,nums2,n);
        int x=nums.length;
        double median=0.0;
        if(x % 2 == 1){
            median = nums[x/2];
        }
        else{
            median = (nums[x/2] + nums[x/2-1]) / 2.0;
        }
        return median;

    }
    public int[] mergeSort(int[]nums1,int m,int[] nums2,int n){
        int []nums=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }
        while(i<m){
            nums[k++]=nums1[i++];
        }
        while(j<n){
            nums[k++]=nums2[j++];
        }
        return nums;
    }
}
