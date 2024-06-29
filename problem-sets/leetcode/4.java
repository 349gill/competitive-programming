import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums = new ArrayList<>();
        int p1 = 0, p2 = 0, n1 = nums1.length, n2 = nums2.length;
        
        while (p1 < n1 && p2 < n2) {
            if (nums1[p1] < nums2[p2]) {
                nums.add(nums1[p1]);
                p1++;
            } 
            else {
                nums.add(nums2[p2]);
                p2++;
            }
        }
        
        while (p1 < n1) {
            nums.add(nums1[p1++]);
        }
        
        while (p2 < n2){
            nums.add(nums2[p2++]);
        }
        
        int median = (n1 + n2) / 2;
        
        if ((n1 + n2) % 2 == 0) {
            return (nums.get(median - 1) + nums.get(median)) / 2.0;
        }
        else {
            return nums.get(median);
        }
    }
}