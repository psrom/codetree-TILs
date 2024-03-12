N, P = map(int, input().split())
stack = []
temp = N
idx = 0

while True:
    temp *= N
    temp %= P
    
    if temp in stack:
        idx = stack.index(temp)
        break
    else:
        stack.append(temp)

print(len(stack) - idx)