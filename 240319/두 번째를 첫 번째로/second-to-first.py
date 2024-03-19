s = input()
s1, s2 = s[0], s[1]

ans = ''
for i in range(len(s)):
    if s[i] == s[1]:
        ans += s[0]
    else:
        ans += s[i]

print(ans)