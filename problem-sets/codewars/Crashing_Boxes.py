# https://www.codewars.com/kata/5a4a167ad8e1453a0b000050

def crashing_weights(weights):
    def crash_func(w):
        for x in range(0,len(w)):
            for i in range(0,len(w)-1):
                for j in range(0,len(w[1])):
                    if w[i][j]>w[i+1][j]:
                        w[i+1][j] = w[i][j]+w[i+1][j]
                        w[i][j] = 0
        return w[-1]    
    return crash_func(weights)                
                