class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        volume = 0

        left = 0
        right = len(height) - 1
        
        max_left = height[left]
        max_right = height[right]
        while left < right:
            if max_left < max_right:
                left += 1
                if height[left] > max_left:
                    max_left = height[left]
                else:
                    volume += max_left - height[left]

            else:
                right -= 1
                if height[right] > max_right:
                    max_right = height[right]
                else:
                    volume += max_right - height[right]

        return volume