a=int(input())
if a==2:
    print("Yes")
    exit()
if a==0 or a==1:
    print("No")
    exit()
for i in range(2,a):
    if a%i==0:
        print("No")
        exit()
print("Yes")
        

    
