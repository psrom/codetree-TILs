n = int(input())
lst = [list(map(int, input().split())) for _ in range(n)]
max_val = max(map(max, lst)) + 10

graph = [[0] * max_val for _ in range(max_val)]

for x, y in lst:
    for i in range(y, y + 10):
        for j in range(x, x + 10):
            graph[i][j] = 1

answer = 0
for row in graph:
    answer += sum(row)

print(answer)