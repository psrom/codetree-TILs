n = int(input())
graph = [[1] * n for _ in range(n)]

for i in range(1, n):
    for j in range(1, n):
        graph[i][j] = graph[i - 1][j] + graph[i - 1][j - 1] + graph[i][j - 1]

for row in graph:
    print(*row)