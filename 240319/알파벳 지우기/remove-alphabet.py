a = input()
b = input()

num1, num2 = '', ''
for i in a:
    if i.isdigit():
        num1 += i
    
for j in b:
    if j.isdigit():
        num2 += j

print(int(num1) + int(num2))