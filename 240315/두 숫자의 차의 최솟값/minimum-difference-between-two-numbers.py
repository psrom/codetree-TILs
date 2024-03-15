n = int(input())
lst = list(map(int, input().split()))

ans = float('inf')
for i in range(n - 1):
    for j in range(i + 1, n):
        ans = min(ans, lst[j] - lst[i])

print(ans)