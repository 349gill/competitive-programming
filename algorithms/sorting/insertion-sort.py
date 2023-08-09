unsorted = [0, 9, 17, 6, 5, 20, 3, 20, -16, 13]
sorted = [-16, 0, 3, 5, 6, 9, 13, 17, 20, 20]

"""
Best sorting algorithm for almost-sorted arrays, small collections, and linked lists.
We go through the array and divide it into a sorted and unsorted section.
At each index, the element is compared with the preceding elements and placed at its correct position.
Complexity = O(n^2)
"""


def sort(arr):
    for i in range(1, len(arr)):
        current = int(arr[i])
        j = i-1
        while j >= 0 and current < arr[j]:
            arr[j+1] = arr[j]
            j -= 1
        arr[j+1] = current
    return arr


if __name__ == "__main__":
    print(sorted == sort(unsorted))
