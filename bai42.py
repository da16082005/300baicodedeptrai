a=int(input())
b = list(map(int, input().split()))
i=0
count=0
if len(b)!=a:
    exit()
else:
    while i< len(b):
        if b[i]>0:
            count+=1
        i+=1
print(count)

    

