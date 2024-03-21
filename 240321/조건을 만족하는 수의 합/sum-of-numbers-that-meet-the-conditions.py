n = int(input())
if n % 2 == 1:
    n += 1

answer =0
for i in range(n, 501, 2):
    answer += i

print(answer)