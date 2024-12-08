class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        d = {}
        for i in nums:
            if i in d:
                d[i] += 1
            else:
                d[i] = 1
        l = []
        d = list(sorted(d.items(), key=lambda x:x[1]))
        d.reverse()
        for i in range(k):
            l.append(d[i][0])
        print(d)
        return l
        