class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        size = len(nums)
        for i in range(size):
            for j in range(size):
                if i != j and nums[i] + nums[j] == target:
                    return [i, j]