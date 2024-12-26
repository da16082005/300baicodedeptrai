a=int(input())
so=[]
for i in range(1,a+1):
    if i % 3==0 and i %5==0:
        so.append(i)
print(sum(so))

