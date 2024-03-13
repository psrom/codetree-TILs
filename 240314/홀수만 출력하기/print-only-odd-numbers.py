lst = []
for _ in range(int(input())):
    n = int(input())
    if n % 2 == 1 and n % 3 == 0:
        lst.append(n)

for i in lst:
    print(i)