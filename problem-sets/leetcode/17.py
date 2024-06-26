digit_to_char = {
            '2': ['a', 'b', 'c'],
            '3': ['d', 'e', 'f'],
            '4': ['g', 'h', 'i'],
            '5': ['j', 'k', 'l'],
            '6': ['m', 'n', 'o'],
            '7': ['p', 'q', 'r', 's'],
            '8': ['t', 'u', 'v'],
            '9': ['w', 'x', 'y', 'z'],
        }

class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        
        if (digits == ""):
            return []
        
        if (len(digits) == 1):
            return digit_to_char[digits]
        
        possible = []
        
        i = self.letterCombinations(digits[1:])
        for j in digit_to_char[digits[0]]:
            for k in i:
                possible.append(j + k)
            
        return possible