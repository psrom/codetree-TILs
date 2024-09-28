from collections import deque

N, K  = map(int, input().split())
lst = list(map(int, input().split()))
res = 0
humans = deque()

# N번 칸에서 하차
while True:
    if (lst.count(0) >= K):
        break

    # 벨트 회전
    lst = [lst[-1]] + lst[:-1]

    # 사람 한 칸씩 이동
    for i in range(len(humans)):
        humans[i] += 1
    
    # 하차
    if humans and humans[0] == N - 1:
        humans.popleft()

    # 이동 가능한지 확인
    for i in range(len(humans)):
        h = humans[i]
        if h + 1 < N and lst[h + 1] > 0 and (h + 1 not in humans):
            humans[i] += 1
            lst[h + 1] -= 1

    # 하차
    if humans and humans[0] == N - 1:
        humans.popleft()

    # 첫번째 칸에 사람 탈 수 있는 지
    if lst[0] > 0:
        lst[0] -= 1
        humans.append(0)
    
    res += 1

print(res)