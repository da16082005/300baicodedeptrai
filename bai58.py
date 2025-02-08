a=int(input())
b={}
for i in range(a):
    c=int(input())
    
    if c not in b.keys():
        b.update({c:1})
    else:
        b[c]+=1
        
for key, value in b.items():
    print(f"{key} {value}")


