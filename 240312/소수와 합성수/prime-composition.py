n = int(input())
if n == 1:
    print('one')
else:
    check = False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            print('composition')
            check = True
            break
    if not check: 
        print('prime')