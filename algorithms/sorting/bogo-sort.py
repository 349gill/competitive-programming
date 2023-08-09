import random

unsorted = [0, 9, 17, 6, 5, 20, 3, 20, -16, 13]
sorted = [-16, 0, 3, 5, 6, 9, 13, 17, 20, 20]

"""
Also known as Permutation sort. An array is repeatedly shuffled until it is sorted.
Complexity: It is a boundless function, complexity cannot be determined, may be deemed 'infinity' if you desperately want an answer.

Total permutations of elements in an array = n!
Probably of a random combination of array elements to be sorted = 1/n!
Hence, it will take us n! permutations to arrive at the correct result.
For each iteration, n steps are needed to check if the elements are sorted.
Hence, Average Complexity = n! * n
Research Paper analyzing Bogo-sort: https://sites.math.washington.edu/~morrow/336_13/papers/max.pdf
More info: https://en.wikipedia.org/wiki/Bogosort
"""


def sort(arr):
    while sorted(arr) == False:
        for i in range(len(arr)):
            r = int(random.random()*(len(arr)-1))  # Random index
            arr[i], arr[r] = arr[r], arr[i]  # Swap
        print(arr)

    return arr


def sorted(arr):  # Checks if array is sorted
    for i in range(len(arr)):
        if arr[i] > arr[i+1]:
            return False
    return True


if __name__ == "__main__":
    print(sorted == sort(unsorted))
