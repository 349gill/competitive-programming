# https://www.codewars.com/kata/5a805d8cafa10f8b930005ba

def nearest_sq(n):
    greater = n
    smaller = n
    while True:
        if greater**0.5 == int(greater**0.5):
            return greater
        elif smaller**0.5 == int(smaller**0.5):
            return smaller
        else:
            smaller -= 1
            greater += 1