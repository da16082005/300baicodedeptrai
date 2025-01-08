def is_prime(number):
    if number==2:
        return True
    elif number <2:
        return False
    else:
        for i in range(2, number):
            if number % i == 0:
                return False
            
        return True
m,n = map(int, input().split())
count=0
allnum=0
for i in range(m,n+1):
    if is_prime(i)== True:
        count+= i
        allnum +=1


print(f"{count/allnum:.2f}")
        
           
        
            


