n = int(input())
graph = [[0] * n for _ in range(n)]

number = 1
direction = False
for i in range(n, 0, -1):
    if not direction:
        for j in range(n, 0, -1):
            graph[j - 1][i - 1] = number
            number += 1
        direction = True
    else:
        for j in range(0, n):
            graph[j][i - 1] = number
            number += 1
        direction = False
        

for row in graph:
    print(*row)