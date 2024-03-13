n = int(input())
i = 9
for _ in range(n):
    for _ in range(n):
        if i == 0:
            i = 9
        print(i, end="")
        i -= 1
    print()