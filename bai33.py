def is_prime(number):
    if number <2:
        return False
    for i in range(2, number):
        if number % i == 0:
            return False
            exit()
    return True
m,n = map(int, input().split())
count=0
for i in range(m,n+1):
    if is_prime(i)== True:
        count+=1
print(count)
        
           
        
            


