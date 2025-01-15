a,b = map(int, input().split())
c = list(map(int, input().split()))
i=0
have =False
if len(c)!=a:
    exit()
else:
    while i< len(c):
        if c[i] ==b:
            print("Yes")
            print(i)
            have=True
            exit()
        
            
        i+=1
if have==False:
    print('No')
