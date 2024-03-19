s = input()
idx = 0
for i in range(len(s)):
    if s[i] == 'e':
        idx = i
        break

print(s[:idx] + s[idx + 1:])