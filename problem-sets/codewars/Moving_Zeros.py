def move_zeros(lst):
    zeros = lst.count(0)
    lst = [i for i in lst if i!=0]
    for i in range(0, zeros):
        lst.append(0)
    return lst   