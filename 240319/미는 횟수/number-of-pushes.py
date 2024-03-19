A = input()
B = input()

for i in range(len(A) - 1):
    A = A[1:] + A[0]
    if A == B:
        print(i + 1)
        break