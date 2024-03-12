stack = [0] * 1001
for _ in range(int(input())):
    s, t, b = map(int, input().split())
    
    for i in range(s, t + 1):
        stack[i] += b

print(max(stack))