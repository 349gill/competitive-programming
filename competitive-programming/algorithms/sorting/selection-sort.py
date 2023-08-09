unsorted = [0, 9, 17, 6, 5, 20, 3, 20, -16, 13]
sorted = [-16, 0, 3, 5, 6, 9, 13, 17, 20, 20]

"""
Don't confuse it with Insertion-sort!
Smallest/largest element is selected from the unsorted portion & moved to the sorted portion.
Meanwhile, in Insertion-sort, each subsequent element finds its place in the sorted region 
by shifting all the other elements to its right.
Complexity for all cases: O(n^2)
"""


def sort(arr):
    for i in range(len(arr)):
        min_index = i
        for j in range(i, len(arr)):
            if arr[j] < arr[min_index]:  # Finding the smallest element
                min_index = j
        if min_index != i:
            arr[min_index], arr[i] = arr[i], arr[min_index]  # Swap
    return arr


if __name__ == "__main__":
    print(sorted == sort(unsorted))
