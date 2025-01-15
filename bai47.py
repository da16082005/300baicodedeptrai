a=int(input())
b = list(map(int, input().split()))
c=[]
d=[]
i=0
count1=0
count2=0
if len(b)!=a:
    exit()
else:
    while i< len(b):
        if b[i]>0:
            c.append(b[i])
            count1+=1
        elif b[i]<0:
            d.append(b[i])
            count2+=1
        i+=1

print(f"{count1} {count2}")
if len(c)==0:
    print("-")

    print(" ".join(map(str, d)))    
elif len(d)==0:
   
    print(" ".join(map(str, c)))  
    print("-")
else:
    print(" ".join(map(str, c)))  
    print(" ".join(map(str, d)))   
