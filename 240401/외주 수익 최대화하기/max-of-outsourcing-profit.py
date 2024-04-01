n = int(input())

dp = [0] * (n + 1)
tasks = [list(map(int, input().split())) for _ in range(n)]

for i in range(n - 1, -1, -1):
    if i + tasks[i][0] <= n:
        dp[i] = max(dp[i + tasks[i][0]] + tasks[i][1], dp[i + 1])
    else:
        dp[i] = dp[i + 1]  # n일을 넘어가는 경우

print(dp[0])