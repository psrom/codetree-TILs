A = input()
B = input()

check = False
for i in range(len(A)):
    A = A[1:] + A[0]
    if A == B:
        check = True
        print(i + 1)
        break

if not check:
    print(-1)