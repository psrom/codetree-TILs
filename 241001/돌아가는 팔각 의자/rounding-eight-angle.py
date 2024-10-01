tables = [list(map(int, input())) for _ in range(4)]
k = int(input())
orders = [list(map(int, input().split())) for _ in range(k)]

def move(check):
    for i in range(4):
        if check[i] == 1:
            tables[i] = [tables[i][-1]] + tables[i][:-1]
        elif check[i] == -1:
            tables[i] = tables[i][1:] + [tables[i][0]]
    return tables


# index 2, 6 비교
# 시계 방향 1, 반시계 방향 -1, 움직이지 않으면 0
for n, d in orders:
    check = [0, 0, 0, 0]
    check[n - 1] = d

    for i in range(n - 1, 0, -1):
        if tables[i][6] != tables[i - 1][2]:
            check[i - 1] = -check[i]
        else:
            break

    for i in range(n - 1, 3):
        if tables[i][2] != tables[i + 1][6]:
            check[i + 1] = -check[i]
        else:
            break
    tables = move(check)

result = 0
for i in range(4):
    result += (2 ** i) * tables[i][0]

print(result)