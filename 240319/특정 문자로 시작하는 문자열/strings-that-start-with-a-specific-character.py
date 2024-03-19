words = list(input() for _ in range(int(input())))
target = input()

cnt = 0
l = 0
for word in words:
    if word[0] == target:
        cnt += 1
        l += len(word)

print(cnt, f"{l/cnt:.2f}")