a=int(input())

ls=[]
i=1
while i*i <= a:
    
    ls.append(i*i)
    i+=1
if a== ls[len(ls)-1]:
    print("Yes")
else:
    print("No")
    

