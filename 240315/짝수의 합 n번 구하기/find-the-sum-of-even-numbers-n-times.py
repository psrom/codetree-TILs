for _ in range(int(input())):
    answer = 0
    a, b = map(int, input().split())
    if a % 2 == 1:
        a += 1
    for i in range(a, b + 1, 2):
        answer += i

    print(answer)