MAX_T = 1_000_000_001
N, C, G, H = map(int, input().split())

A, B = [MAX_T], [MAX_T]

for _ in range(N):
    ta, tb = map(int, input().split())
    A.append(ta)
    B.append(tb)

A.sort()
B.sort()

i, j = 0, 0
current_work = N * C
answer = N * C

while i < N or j < N:
    if A[i] <= B[j]:
        current_work += G - C
        i += 1
    else:
        current_work += H - G
        j += 1
    if current_work > answer:
        answer = current_work
print(answer)