# 3:32

# 입력
N = int(input())
graph = [list(map(int, input().split())) for _ in range(N)]

elements = [i for i in range(N)]
group_size = N // 2

comb = []

# 조합 만들기
def create_combinations(groupDay, idx):
    if len(groupDay) == group_size:
        groupNight = [e for e in elements if e not in groupDay]
        comb.append((groupDay, groupNight))
        return
    
    for i in range(idx, N):
        create_combinations(groupDay + [elements[i]], i + 1)

create_combinations([], 0)
comb = comb[:len(comb)//2]

# 업무 강도 계산
min_diff = float('inf')

for day, night in comb:
    day_sum, night_sum = 0, 0

    for i in range(group_size):
        for j in range(i + 1, group_size):
            day_sum += graph[day[i]][day[j]] + graph[day[j]][day[i]]

    for i in range(group_size):
        for j in range(i + 1, group_size):
            night_sum += graph[night[i]][night[j]] + graph[night[j]][night[i]]

    
    diff = abs(day_sum - night_sum)
    min_diff = min(min_diff, diff)

print(min_diff)