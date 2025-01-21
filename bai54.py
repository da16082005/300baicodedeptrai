a = list(map(int, input().split()))
b=[]

for i in range(len(a)):
    if a[i]<0:
        b.append(a[i])
max=float('-inf')
for i in range(len(b)):
    if max <b[i]:
        max=b[i]
if len(b)==0:
    print('-')
else:
    print(max)


    
       

