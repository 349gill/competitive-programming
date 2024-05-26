class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = [char.lower() for char in s if char.isalpha() or char.isnumeric()]

        front = 0
        rear = len(s) - 1
        while front < rear:
            if s[front] != s[rear]:
                return False
            front += 1
            rear -= 1
        return True
        