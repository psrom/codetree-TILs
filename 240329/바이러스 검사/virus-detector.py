n = int(input())
customers = list(map(int, input().split()))
leader, fellow = map(int, input().split())

answer = 0

for customer in customers:
    customer -= leader
    answer += 1

    if customer > 0:
        if customer % fellow == 0:
            answer += customer // fellow
        else:
            answer += customer // fellow + 1

print(answer)