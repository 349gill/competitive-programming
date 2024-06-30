class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        n = len(nums)
        for i in range(k):
            nums.insert(0, nums.pop(n - 1))
        