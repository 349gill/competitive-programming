# https://www.codewars.com/kata/585d7d5adb20cf33cb000235

def find_uniq(arr):
    for i in range(len(arr)):
        if i != len(arr) - 1:
            if arr[i] != arr[i + 1] and arr[i] != arr[i - 1]:
                return arr[i]
        if i == len(arr) - 1:
            if arr[i] != arr[i - 1]:
                return arr[i]