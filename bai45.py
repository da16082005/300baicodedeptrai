a=int(input())
b = list(map(int, input().split()))
count=0
i=0
has_even= False
if len(b)!=a:
    exit()
else:
    while i < len(b):
        if b[i] %2==0:
            count+=b[i]
            has_even = True
        i+=1
    
if has_even== False:
    print("-")    
else:
    print(count)