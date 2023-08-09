unsorted = [0, 9, 17, 6, 5, 20, 3, 20, -16, 13]
sorted = [-16, 0, 3, 5, 6, 9, 13, 17, 20, 20]

"""
Adjacent elements are repeatedly swapped if they are in the wrong order.
Also known as Sinking sort, as the 'heavier' elements are moved to the end.
For each iteration, the largest element which is not already sorted is moved across the array to the sorted side.
Worst case: When array elements are in decreasing order.
Complexity: O(n)*O(n) = O(n^2)
Bubble-sort can also be implemented recursively.
"""


def sort(arr):
    for i in range(len(arr)):
        for j in range(len(arr)-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]  # Swap
    return arr


if __name__ == "__main__":
    print(sorted == sort(unsorted))
