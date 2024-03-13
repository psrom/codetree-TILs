n = int(input())
k = 1
answer = 0
while True:
    if n // k <= 1:
        print(answer + 1)
        break
    n /= k
    k += 1
    answer += 1