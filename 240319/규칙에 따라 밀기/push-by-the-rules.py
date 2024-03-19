s = input()
order = input()
cnt_L, cnt_R = order.count('L'), order.count('R')

if cnt_L > cnt_R:
    cnt = (cnt_L - cnt_R) % len(s)
    print(s[cnt:] + s[:cnt])
elif cnt_R > cnt_L:
    cnt = (cnt_R - cnt_L) % len(s)
    print(s[cnt:] + s[:cnt])
else:
    print(s)