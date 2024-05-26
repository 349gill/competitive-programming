# https://www.codewars.com/kata/53f40dff5f9d31b813000774

from collections import defaultdict, deque

def recoverSecret(triplets):
    graph = defaultdict(list)
    in_degree = defaultdict(int)

    for item in triplets:
        for i in range(len(item) - 1):
            graph[item[i]].append(item[i+1])
            in_degree[item[i]] += 0
            in_degree[item[i+1]] += 1
    
    queue = deque([node for node in in_degree if in_degree[node] == 0])
    sorted_chars = []

    while queue:
        node = queue.popleft()
        sorted_chars.append(node)

        for neighbor in graph[node]:
            in_degree[neighbor] -= 1
            if in_degree[neighbor] == 0:
                queue.append(neighbor)

    return ''.join(sorted_chars)