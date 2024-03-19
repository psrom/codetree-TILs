def check_overlap(sq1, sq2, K):
    x1, y1 = sq1
    x2, y2 = sq2

    distance = ((x1 - x2) ** 2 + (y1 - y2) ** 2) ** 0.5

    if distance < K / 2:
        return True
    else:
        return False


def cal_area(sq1, sq2, K):
    half = K // 2
    x1, y1 = sq1[0] - half, sq1[1] + half
    x2, y2 = sq1[0] + half, sq1[1] - half
    x3, y3 = sq2[0] - half, sq2[1] + half
    x4, y4 = sq2[0] + half, sq2[1] - half

    l_up_x, l_up_y = max(x1, x3), min(y1, y3)
    r_down_x, r_down_y = min(x2, x4), max(y2, y4)

    w = r_down_x - l_up_x
    h = l_up_y - r_down_y

    return w * h


N, K = map(int, input().split())
squares = list(list(map(int, input().split())) for _ in range(N))

lst = []
for i in range(N):
    for j in range(i + 1, N):
        check = check_overlap(squares[i], squares[j], K)
        if check:
            lst.append(squares[i])
            lst.append(squares[j])

        if len(lst) > 2:
            break

l = len(lst)
if l == 0:
    print(0)
elif l > 2:
    print(-1)
else:
    ans = cal_area(lst[0], lst[1], K)
    print(ans)