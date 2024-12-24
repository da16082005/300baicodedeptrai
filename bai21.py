a=int(input())

if a ==1:
    print(12000)
elif a >=2 and a <=30:
    b=12000+(a-1)*10000
    print(b)
elif a >=31:
    b=12000+29*10000+(a-30)*9000
    print(b)
    
