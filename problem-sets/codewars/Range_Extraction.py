# https://www.codewars.com/kata/51ba717bb08c1cd60f00002f

def solution(args):
    l = [[args[0]]]
    for i in range(1, len(args)):
        if int(args[i]) == int(l[-1][-1]) + 1:
            l[-1].append(int(args[i]))
        else:
            l.append([int(args[i])])
         
    s = ""
    for i in range(len(l)):
         if len(l[i]) > 2:
            s += f"{l[i][0]}-{l[i][-1]},"
         else:
            if len(l[i]) == 2:
                s += f"{l[i][0]},{l[i][1]},"
            else:
                s += f"{l[i][0]},"
         
    return s[:-1]