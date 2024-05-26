from preloaded import Node

def array_to_tree(arr):
    if arr == []:
        return None
    for i in range(len(arr)):
        arr[i] = Node(arr[i], None, None)
    for i in range(len(arr)):
        if ((2 * i) + 1) < len(arr):
            arr[i].left = arr[(2 * i) + 1]
        if (2 * (i + 1)) < len(arr):
            arr[i].right = arr[2 * (i + 1)]
    return arr[0]
            
    return 