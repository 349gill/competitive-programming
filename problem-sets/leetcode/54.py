class Solution(object):
    def spiralOrder(self, matrix):
        left = 0
        right = len(matrix[0])
        up = 0
        down = len(matrix)

        arr = []
        while True:
            for i in range(left, right):
                arr.append(matrix[up][i])
            up += 1
            if compare_sizes(arr, matrix): break

            for j in range(up, down):
                arr.append(matrix[j][right - 1])
            right -= 1
            if compare_sizes(arr, matrix): break

            for k in range(right - 1, left - 1, -1):
                arr.append(matrix[down - 1][k])
            down -= 1
            if compare_sizes(arr, matrix): break

            for l in range(down - 1, up - 1, -1):
                arr.append(matrix[l][left])
            left += 1
            if compare_sizes(arr, matrix): break

        return arr
        
def compare_sizes(one_d, two_d):
    return len(one_d) == len(two_d) * len(two_d[0])
        