import java.util.*;
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                left.add(nums[i]);
            }
            else if (nums[i] > pivot) {
                right.add(nums[i]);
            }
            else {
                right.add(0, nums[i]);
            }
        }
        
        int i = 0, j = 0, k = 0;
        for (; i < left.size(); i++, k++) {
            nums[k] = left.get(i);
        }
        for (; j < right.size(); j++, k++) {
            nums[k] = right.get(j);
        }
        
        return nums;
    }
}