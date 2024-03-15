n, m = map(int, input().split())
graph1, graph2 = [], []

for _ in range(n):
    lst = list(map(int, input().split()))
    graph1.append(lst)

for _ in range(n):
    lst = list(map(int, input().split()))
    graph2.append(lst)
    
answer = [[0] * m for _ in range(n)]

for i in range(n):
    for j in range(m):
        if graph1[i][j] != graph2[i][j]:
            answer[i][j] = 1

for row in answer:
    print(*row)