def nextnum(i):
    digit = 0
    for num in i[-3:]:digit = digit + num
    return i.append(digit)
def tribonacci(signature, n):
    for i in range(n):nextnum(signature)
    return signature[:int(n)]    
    