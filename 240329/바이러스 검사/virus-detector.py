n = int(input())
customers = list(map(int, input().split()))
leader, fellow = map(int, input().split())

answer = n
customers = [i - leader for i in customers]

if sum(customers) > 0:
    cnt_0 = customers.count(0)
    customers = [i // fellow for i in customers]
    answer += sum(customers) + n - cnt_0

print(answer)