n = int(input())
answer = []
for i in range(1, int(n ** 0.5) + 1):
        if (n % i == 0):
            answer.append(i)
            if ((i ** 2) != n):
                answer.append(n // i)

answer.sort()
print(*answer)