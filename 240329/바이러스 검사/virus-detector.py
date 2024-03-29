n = int(input())
customers = list(map(int, input().split()))
leader, fellow = map(int, input().split())

answer = n
customers = [(i - leader) // fellow for i in customers]
answer += sum(customers) + n

print(answer)