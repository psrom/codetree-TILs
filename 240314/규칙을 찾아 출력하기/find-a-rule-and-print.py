n = int(input())

print("* " * n)

j = n - 3
for i in range(1, n - 1):
    print("* " * i + " " * (n - i + j) + "* ")
    j -= 1

print("* " * n)