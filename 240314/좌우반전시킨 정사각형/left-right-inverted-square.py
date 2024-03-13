n = int(input())
j = 1

for _ in range(n):
    for i in range(n, 0, -1):
        print(i * j, end=' ')
    print()
    j += 1