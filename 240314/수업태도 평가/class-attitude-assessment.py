students = ['Bessie', 'Elsie', 'Daisy', 'Gertie', 'Annabelle', 'Maggie', 'Henrietta']
d = {student: 0 for student in students}

for _ in range(int(input())):
    name, score = input().split()
    d[name] += int(score)


d = sorted(d.items(), key=lambda x: x[1])

min_val = d[0][1]
second_val = 0

for key, val in d:
    if val > min_val:
        second_val = val
        break

cnt = 0
answer = ''
for key, val in d:
    if val == second_val:
        cnt += 1
        answer = key

if cnt != 1:
    print('Tie')
else:
    print(answer)