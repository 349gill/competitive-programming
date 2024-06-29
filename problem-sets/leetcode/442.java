import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> duplicates = new ArrayList<>();
        
        for (int num : nums){
            if (nums[Math.abs(num) - 1] < 0) {
                duplicates.add(Math.abs(num));
            }
            else {
                nums[Math.abs(num) - 1] *= -1;
            }
        }
        return duplicates;
    }
}