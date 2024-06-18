import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int hours, left = 1, right = piles[piles.length - 1], speed = right;
        
        while (left <= right) {
            hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours += (int) Math.ceil((double) piles[i] / ((int) (left + right) / 2));
                if (hours > h) {
                    break;
                }
            }
            if (hours <= h) {
                speed = Math.min((int)(left + right) / 2, speed);
                right = ((int) (left + right) / 2) - 1;
            }
            else {
                left =  ((int) (left + right) / 2) + 1;
            }
        }
        return speed;
    }
}