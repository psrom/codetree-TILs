N = int(input())
numbers = list(map(int, input().split()))
operator_count = list(map(int, input().split()))

comb = []

def combinations(op):
    if len(op) == N - 1:
        comb.append(op)
        return
    for i in range(3):
        if operator_count[i] > 0:
            operator_count[i] -= 1
            combinations(op + [i])
            operator_count[i] += 1

combinations([])

min_sum, max_sum = float('inf'), float('-inf')

for operator in comb:
    s = numbers[0]
    for i in range(1, N):
        if operator[i - 1] == 0:
            s += numbers[i]
        elif operator[i - 1] == 1:
            s -= numbers[i]
        else:
            s *= numbers[i]

    min_sum = min(s, min_sum)
    max_sum = max(s, max_sum)

print(min_sum, max_sum)