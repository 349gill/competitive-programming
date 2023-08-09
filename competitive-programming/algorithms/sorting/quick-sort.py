unsorted = [0, 9, 17, 6, 5, 20, 3, 20, -16, 13]
sorted = [-16, 0, 3, 5, 6, 9, 13, 17, 20, 20]

"""
Working Principle: An element is considered sorted if all the elements to its left are
smaller & all the elements to its right are larger.

Quick-sort is a Divide and Conquer algorithm.

A 'pivot' is selected for each iteration of the partition() function, which can be any element of the array.
Usually, we pick either the first, last, middle, or a random element of the array.

The partition() function places the pivot at its correct position.
Partition is done recursively on each side of the pivot after the pivot
is placed in its correct position and this finally sorts the array.

Complexity analysis:
Best case: N*logN
Average case: N*logN
Worst case: N*2

Auxiliary Space: The extra space that is taken by an algorithm temporarily to finish its work.
For Quick-sort: Auxiliary Space is O(logN)
"""


def partition(arr, low, high):

    pivot = arr[high]  # Using last element as pivot
    i = low - 1
    for j in range(low, high):
        if arr[j] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i+1], arr[high] = arr[high], arr[i+1]
    return i+1


def sort(arr, low, high):
    if low < high:
        partitioning_index = partition(arr, low, high)
        sort(arr, low, partitioning_index-1)  # Before Partitioning index
        sort(arr, partitioning_index+1, high)  # After Partitioning index


if __name__ == "__main__":
    sort(unsorted, 0, len(unsorted)-1)
    print(unsorted == sorted)
