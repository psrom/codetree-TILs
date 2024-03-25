MAX_VAL = 511
n = int(input())
graph = [[0] * (MAX_VAL) for _ in range(MAX_VAL)]

for _ in range(n):
    x, y = map(int, input().split())
    for i in range(x, x + 10):
        for j in range(y, y + 10):
            graph[i][j] = 1

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

result = 0
for x in range(1, MAX_VAL):
    for y in range(1, MAX_VAL):
        if graph[x][y] == 1:
            cnt = 0

            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]
                if graph[nx][ny] == 1:
                    cnt += 1

            if cnt == 3:
                result += 1
            elif cnt == 2:
                result += 2

print(result)