a=int(input())
b = list(map(int, input().split()))
count=0
i=0
if len(b)!=a:
    exit()
else:
    while i< len(b):
        if i %2==0:
            count+=b[i]
        i+=1
print(count)





