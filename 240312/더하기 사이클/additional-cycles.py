n = input()
temp = n
ans = 0
while True:
    first = ''
    new = ''
    if len(temp) == 1:
        first = temp
    else:
        first = str(int(temp[0]) + int(temp[1]))

    new = str(int(temp[-1] + first[-1]))
    ans += 1
    temp = new
    
    if n == new:
        break

print(ans)