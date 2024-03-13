lst = []
while True:
    n = int(input())

    if n < 20 or n >= 30:
        print(format(sum(lst) / len(lst), ".2f"))
        break

    lst.append(n)