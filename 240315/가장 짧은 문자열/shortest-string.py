lst = []
for _ in range(3):
    lst.append(len(input()))

print(max(lst) - min(lst))