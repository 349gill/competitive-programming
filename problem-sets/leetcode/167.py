def binary_search(low, high, num, numbers):
    if low <= high:
        mid = (low + high) // 2
        if numbers[mid] == num:
            return mid
        elif numbers[mid] > num:
            return binary_search(low, mid - 1, num, numbers)
        else:
            return binary_search(mid + 1, high, num, numbers)
    return -1

class Solution(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(numbers)):
            complement = binary_search(0, len(numbers) - 1, target - numbers[i], numbers)
            if complement not in [-1, i]:
                return sorted([complement + 1, i + 1])
