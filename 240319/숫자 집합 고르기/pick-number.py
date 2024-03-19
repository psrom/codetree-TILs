n = int(input())
graph = [[] for _ in range(n + 1)]
lst = list(map(int, input().split()))

for i in range(n):
    graph[lst[i]].append(i + 1)


def dfs(node, route):
    visited[node] = True
    for i in graph[node]:
        if not visited[i]:
            dfs(i, route)
        elif visited[i] and i == route:
            result.append(i)

result = []
for i in range(1, n + 1):
    visited = [False for _ in range(n + 1)]
    dfs(i, i)

print(len(result))
print(*result)