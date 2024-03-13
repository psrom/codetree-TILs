n = int(input())
current = 0
for i in range(n):
    if i % 2 == 0:
        for _ in range(n):
            current += 1
            print(current, end=" ")
    else:
        for _ in range(n):
            current += 2
            print(current, end=" ")
    print()