graph = []
for _ in range(4):
    lst = list(map(int, input().split()))
    graph.append(lst)

answer = 0
for i in range(4):
    for j in range(0, i + 1):
        answer += graph[i][j]

print(answer)