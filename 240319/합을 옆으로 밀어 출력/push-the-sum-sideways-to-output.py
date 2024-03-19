lst = [int(input()) for _ in range(int(input()))]
s = str(sum(lst))
print(s[1:] + s[0])