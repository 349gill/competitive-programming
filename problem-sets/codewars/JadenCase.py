# https://www.codewars.com/kata/5390bac347d09b7da40006f6

def to_jaden_case(string):
    newlist = string.split()
    newstr = str()
    for i in newlist:
        newstr += i.capitalize() + ' '
    newstr = newstr[:-1]
    return newstr