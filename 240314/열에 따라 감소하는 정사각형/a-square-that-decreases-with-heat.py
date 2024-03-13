n = int(input())
lst = [i for i in range(n, 0, -1)]

for _ in range(n):
    print(*lst)