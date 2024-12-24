a=int(input())
so=[]
for i in range(1,a+1):
    if i %3==0:
        so.append(i)
       
if len(so)==0:
    print('-')
else:
    so= " ".join(map(str, so))
    print(so)




