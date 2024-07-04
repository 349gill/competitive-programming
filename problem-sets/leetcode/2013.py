class DetectSquares(object):

    def __init__(self):
        self.counts = defaultdict(int)
        self.points = []

    def add(self, point):
        """
        :type point: List[int]
        :rtype: None
        """
        self.counts[tuple(point)] += 1
        self.points.append(point)
        
    def count(self, point):
        """
        :type point: List[int]
        :rtype: int
        """
        result = 0
        px, py = point
        
        for x, y in self.points:
            if (abs(py - y) != abs(px - x) or x == px or y == py):
                continue
            result += self.counts[(x, py)] * self.counts[(px, y)]
        return result;
        


# Your DetectSquares object will be instantiated and called as such:
# obj = DetectSquares()
# obj.add(point)
# param_2 = obj.count(point)