n = int(input())
lst = list(map(int, input().split()))
d = {i: 0 for i in range(1, 9)}

for i in lst:
    d[i] += 1

for key, val in d.items():
    print(f"{key} - {val}")