a, b = map(int, input().split())
lst = [0] * b
while a > 1:
    mod = a % b
    a = a // b
    lst[mod] += 1

answer = 0
for l in lst:
    answer += l ** 2

print(answer)