import math
a= list(map(int, input().split()))
i=0
count=0
sum=0
while i<len(a):
    if a[i]<0:
        i+=1
        continue
    if math.sqrt(a[i])*math.sqrt(a[i])==a[i]:
        sum+=a[i]
        count+=1
    i+=1
if sum==0:
    print('-')
else:
    print(f"{(sum/count):.1f}")



    