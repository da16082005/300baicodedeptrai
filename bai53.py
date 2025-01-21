a = list(map(int, input().split()))
b=[]
def is_prime(number):
    if number <2:
        return False
    for i in range(2, number):
        if number % i == 0:
            return False
            exit()
    return True
for i in range(len(a)):
    if is_prime(a[i])== True:
        b.append(a[i])
max=0
for i in range(len(b)):
    if b[i]> max:
        max=b[i]
if len(b)==0:
    print('-')
else:
    print(max)
