N, P = map(int, input().split())
stack = []
temp = N

while True:
    temp *= N
    temp %= P
    
    if temp in stack:
        break
    else:
        stack.append(temp)
    
print(len(stack))