# 65~90 CHR
n = int(input())
c = 65
for i in range(n, 0, -1):
    print("  " * (n - i), end="")
    for j in range(0, i):
        print(chr(c), end=" ")
        c += 1
    print()