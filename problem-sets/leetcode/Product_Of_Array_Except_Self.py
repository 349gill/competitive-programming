class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        list1 = [1]
        list2 = [1]
        reversed_nums = nums[::-1]
        for i in range(1, len(nums)):
            list1.append(nums[i - 1] * list1[i - 1])
            list2.append(reversed_nums[i - 1] * list2[i - 1])

        products = []
        for i in range(len(nums)):
            products.append(list1[i] * list2[len(nums) - 1 - i])
        return products