A = input()
B = input()

def check(A, B):
    n = len(A)
    for i in range(1, n + 1):
        temp = A[-i:] + A[:-i]
        if temp == B:
            return i
    return -1

result = check(A, B)
print(result)