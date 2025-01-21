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
c=sum(b)/len(b)
print(f"{c:.2f}")
