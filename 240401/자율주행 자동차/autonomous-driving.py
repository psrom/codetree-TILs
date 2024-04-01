dx =[-1, 0, 1, 0]  # 북동남서
dy = [0, 1, 0, -1]

N, M = map(int, input().split())
x, y, d = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(N)]

visited = [[False] * M for _ in range(N)]
visited[x][y] = True
res = 1

while True:
    check = False
    for _ in range(4):
        d = (d + 3) % 4
        nx = x + dx[d]
        ny = y + dy[d]

        if 0 < nx < N and 0 < ny < M and graph[nx][ny] == 0:
            if not visited[nx][ny]:
                visited[nx][ny] = 1
                res += 1
                x, y = nx, ny
                check = True
                break

    if check == False:
        if graph[x - dx[d]][y - dy[d]] == 1:
            print(res)
            break
        else:
            x, y = x - dx[d], y - dy[d]