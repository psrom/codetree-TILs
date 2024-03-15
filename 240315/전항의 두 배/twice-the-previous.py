first, second = map(int, input().split())

lst = [first, second]

for i in range(2, 10):
    temp = lst[i - 1] + 2 * lst[i - 2]
    lst.append(temp)

print(*lst)