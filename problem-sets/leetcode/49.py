class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        hashmap = dict()
        for i in range(len(strs)):
            sorted_str = str(sorted(strs[i]))
            if sorted_str in hashmap.keys():
                hashmap[sorted_str].append(strs[i])
            else:
                hashmap[sorted_str] = [strs[i]]

        return list(hashmap.values())



        