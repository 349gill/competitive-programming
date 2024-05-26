def amount_of_pages(summary):
    my_str = ''
    while len(my_str) < summary:
        for i in range(1,100001):
            my_str = my_str + str(i)
            if len(my_str) == summary:
                break
        return i