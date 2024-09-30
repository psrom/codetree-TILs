from collections import deque

N, L, R = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(N)]

dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]

def bfs(x, y, visited):
    deq = deque()
    deq.append((x, y))
    visited[x][y] = True
    union = [(x, y)]
    egg_sum = graph[x][y]

    while deq:
        x, y = deq.popleft()

        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]

            if 0 <= nx < N and 0 <= ny < N and not visited[nx][ny]:
                if L <= abs(graph[x][y] - graph[nx][ny]) <= R:
                    visited[nx][ny] = True
                    deq.append((nx, ny))
                    union.append((nx, ny))
                    egg_sum += graph[nx][ny]

    if len(union) > 1:
        new_egg_val = egg_sum // len(union)
        for i, j in union:
            graph[i][j] = new_egg_val
        return True
    return False

result = 0

while True:
    visited = [[False] * N for _ in range(N)]
    is_moved = False

    for i in range(N):
        for j in range(N):
            if not visited[i][j]:
                if bfs(i, j, visited):
                    is_moved = True

    if not is_moved:
        break

    result += 1

print(result)