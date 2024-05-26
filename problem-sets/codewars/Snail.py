# https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1

def snail(snail_map):
    left = 0
    right = len(snail_map[0])
    up = 0
    down = len(snail_map)
    
    arr = []
    while True:
        for i in range(left, right):
            arr.append(snail_map[up][i])
        up += 1
        if compare_sizes(arr, snail_map): break
            
        for j in range(up, down):
            arr.append(snail_map[j][right - 1])
        right -= 1
        if compare_sizes(arr, snail_map): break
            
        for k in range(right - 1, left - 1, -1):
            arr.append(snail_map[down - 1][k])
        down -= 1
        if compare_sizes(arr, snail_map): break
            
        for l in range(down - 1, up - 1, -1):
            arr.append(snail_map[l][left])
        left += 1
        if compare_sizes(arr, snail_map): break
        
    return arr
        
def compare_sizes(one_d, two_d):
    return len(one_d) == len(two_d) * len(two_d[0])