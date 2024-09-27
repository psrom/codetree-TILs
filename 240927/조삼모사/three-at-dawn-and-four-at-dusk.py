N = int(input())
graph = [list(map(int, input().split())) for _ in range(N)]
elements = [i for i in range(N)]
size = len(graph) // 2

comb = []

def combinations(dayGroup, idx):
    if len(dayGroup) == size:
        nightGroup = [e for e in elements if e not in dayGroup]
        comb.append((dayGroup, nightGroup))
        return
    
    for i in range(idx, N):
        combinations(dayGroup + [elements[i]], i + 1)

combinations([], 0)
comb = comb[:len(comb) // 2]

print(comb)