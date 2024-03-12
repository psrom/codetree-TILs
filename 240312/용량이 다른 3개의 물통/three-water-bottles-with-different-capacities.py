a_max, a = map(int, input().split())
b_max, b = map(int, input().split())
c_max, c = map(int, input().split())

def change(bottle1, bottle2, bottle2_max):
    if bottle1 + bottle2 <= bottle2_max:
        bottle2 += bottle1
        bottle1 = 0
    else:
        temp = bottle2_max - bottle2
        bottle1 -= temp
        bottle2 += temp
    return bottle1, bottle2, bottle2_max
    

for _ in range(33):
    a, b, b_max = change(a, b, b_max)
    b, c, c_max = change(b, c, c_max)
    c, a, a_max = change(c, a, a_max)

a, b, b_max = change(a, b, b_max)
    
print(a)
print(b)
print(c)