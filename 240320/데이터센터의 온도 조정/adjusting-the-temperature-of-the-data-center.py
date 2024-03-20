N, C, G, H = map(int, input().split())
temp = list(list(map(int, input().split())) for _ in range(N))

min_temp = min(map(min, temp)) - 1
max_temp = max(map(max, temp)) + 1

answer = 0
for i in range(min_temp, max_temp + 1):
    s = 0
    for ta, tb in temp:
        if i < ta:
            s += C
        elif ta <= i <= tb:
            s += G
        else:
            s += H 
    answer = max(answer, s)

print(answer)