a = list(map(int, input().split()))
i=0
b=[]
def is_prime(number):
    if number <2:
        return False
    for i in range(2, number):
        if number % i == 0:
            return False
            exit()
    return True
while i < len(a):
    if is_prime(a[i])== True:
        b.append(a[i])
    i +=1
if len(b)==0:
    print('-')
else:
    print(" ".join(map(str,b)))
    print(sum(b))


    