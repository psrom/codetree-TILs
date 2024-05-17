a, b, c = map(int, input().split())
lst = [a, b, c, a * b, a * c, b * c, a * b * c]

res = 0
for n in lst:
    if (n % 2 == 1):
        res = n
    else:
        if (res % 2 == 1):
            continue
        else:
            res = n

print(res)