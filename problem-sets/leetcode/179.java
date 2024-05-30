import java.io.*;

class Solution {
    public String largestNumber(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        String s = "";
        for (int i = 0; i < nums.length; i++) {
            s += String.valueOf(nums[i]);
        }
        if (nums[0] == 0) {
            return "0";
        }
        return s;
    }
    
    public boolean compare(String s1, String s2) {
        if ((s1 + s2).compareTo(s2 + s1) > 0) {
            return true;
        }
        return false;
    }
    
    void merge(int arr[], int low, int mid, int high)
    {
        int L1 = mid - low + 1;
        int L2 = high - mid;
        
        int A1[] = new int[L1];
        int A2[] = new int[L2];

        for (int i = 0; i < L1; ++i)
            A1[i] = arr[low + i];
        for (int j = 0; j < L2; ++j)
            A2[j] = arr[mid + 1 + j];

        int i = 0, j = 0;

        int k = low;
        while (i < L1 && j < L2) {
            if (compare(String.valueOf(A1[i]), String.valueOf(A2[j]))) {
                arr[k] = A1[i];
                i++;
            }
            else {
                arr[k] = A2[j];
                j++;
            }
            k++;
        }
        
        while (i < L1) {
            arr[k] = A1[i];
            i++;
            k++;
        }
        
        while (j < L2) {
            arr[k] = A2[j];
            j++;
            k++;
        }
        
        return;
    }

    void mergeSort(int arr[], int low, int high)
    {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
        return;
    }
}