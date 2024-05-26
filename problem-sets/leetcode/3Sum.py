class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        triplets = []
        for i in range(len(nums)):
            if i == 0 or nums[i] != nums[i - 1]:
                left, right = i + 1, len(nums) - 1
                while left < right:
                    if nums[left] + nums[right] + nums[i] < 0:
                        left += 1
                    elif nums[left] + nums[right] + nums[i] > 0:
                        right -= 1
                    else:
                        triplets.append([nums[left], nums[right], nums[i]])
                        left += 1
                        while left < len(nums) and nums[left] == nums[left - 1]:
                            left += 1
        return triplets
        