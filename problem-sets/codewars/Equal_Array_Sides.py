# https://www.codewars.com/kata/5679aa472b8f57fb8c000047
def find_even_index(arr):
    for i in range(len(arr)):
        if sum(arr[:i + 1]) == sum(arr[i:]):
            return i
    return -1