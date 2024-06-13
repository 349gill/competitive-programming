import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int i = 0;
        for (; i < arr2.length; i++) {
            map.put(arr2[i], i);
        } 
        
        Arrays.sort(arr1);
        for (int j = 0; j < arr1.length; j++) {
            if (map.get(arr1[j]) == null) {
                map.put(arr1[j], ++i);
            }
        }
        
        quickSort(arr1, 0, arr1.length - 1, map);
        
        return arr1;
    }
    
    static void swap(int[] arr, int i, int j)
    {
        if (arr[i] != arr[j]) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }
        return;
    }

    static int partition(int[] arr, int low, int high, HashMap<Integer, Integer> map)
    {
        int pivot = arr[high], i = (low - 1);
        
        for (int j = low; j <= high - 1; j++) {
            if (map.get(arr[j]) < map.get(pivot)) {
                i++;
                swap(arr, i, j);
            }
        }
        
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high, HashMap<Integer, Integer> map)
    {
        if (low < high) {
            int pi = partition(arr, low, high, map);
            quickSort(arr, low, pi - 1, map);
            quickSort(arr, pi + 1, high, map);
        }
        
        return;
    }
    
}