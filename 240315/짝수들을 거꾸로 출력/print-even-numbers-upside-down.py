n = int(input())
lst = map(int, input().split())

answer = []
for number in lst:
    if number % 2 == 0:
        answer.append(number)

answer = reversed(answer)
print(*answer)