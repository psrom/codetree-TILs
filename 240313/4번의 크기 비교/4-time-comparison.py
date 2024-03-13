a = int(input())
b, c, d, e = map(int, input().split())

def check(x, y):
    if x > y:
        print(1)
    else:
        print(0)

check(a, b)
check(a, c)
check(a, d)
check(a, e)