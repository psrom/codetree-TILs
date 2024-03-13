lst = []
for _ in range(int(input())):
    lst.append(int(input()))

lst.sort()
for i in lst:
    if i % 2 == 1 and i % 3 == 0:
        print(i)