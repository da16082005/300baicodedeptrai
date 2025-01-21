a=int(input())
b = list(map(int, input().split()))
max=0

posi=0

for i in range(len(b)):
    if b[i]>max:
        
        max=b[i]
        posi==i

    
print(f"{max} {posi}")