a, b = map(int, input().split())
check = False
for i in range(a, b + 1):
    if 1920 % i == 0 and 2880 % i == 0:
        check = True
        break

if not check:
    print(0)
else:
    print(1)