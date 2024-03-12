s = input()
target = input()
ans = 1

idx_lst = []

for t in target:
    idx_lst.append(s.index(t))

for i in range(1, len(idx_lst)):
    if idx_lst[i - 1] >= idx_lst[i]:
        ans += 1
    else:
        continue

print(ans)