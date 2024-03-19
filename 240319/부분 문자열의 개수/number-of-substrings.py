ans = 0
A = input()
B = input()

for i in range(0, len(A) - 1):
    if A[i: i + 2] == B:
        ans += 1
print(ans)