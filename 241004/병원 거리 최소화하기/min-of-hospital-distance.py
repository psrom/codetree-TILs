N, M = map(int, input().split()) # 크기, 병원 개수
graph = [list(map(int, input().split())) for _ in range(N)]
hospitals = []
patients = []

for i in range(N):
    for j in range(N):
        if graph[i][j] == 1:
            patients.append((i, j))
        elif graph[i][j] == 2:
            hospitals.append((i, j))

# 가능한 병원의 조합
comb = []
def combinations(start, selected):
    if len(selected) == M:
        comb.append(selected[:])
        return
    
    for i in range(start, len(hospitals)):
        selected.append(hospitals[i])
        combinations(i + 1, selected)
        selected.pop()

combinations(0, [])

# 최소 거리 계산
res = float("inf")
for hospital in comb:
    hospital_distance = 0
    for patient in patients:
        patient_distance = float("inf")
        p_c, p_r = patient
        for i in range(M):
            h_c, h_r = hospital[i]
            d = abs(h_c - p_c) + abs(h_r - p_r)
            patient_distance = min(patient_distance, d)
        hospital_distance += patient_distance
    res = min(hospital_distance, res)

print(res)