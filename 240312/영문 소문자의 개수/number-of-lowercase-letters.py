n = int(input())
s = list(input().split())

d = dict()
for a in s:
    if a.islower():
        if a not in d:
            d[a] = 1
        else:
            d[a] += 1
    else:
        break
    
d = sorted(d.items())
for key, val in d:
    print(key, ":", val)