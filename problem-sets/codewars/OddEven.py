def odd_or_even(n):
    if n==1:return 'Either'
    else:
        if n%2 == 0:
            if (n/2)%2 == 0: return 'Even'
            else: return 'Odd'
        else: return 'Either'