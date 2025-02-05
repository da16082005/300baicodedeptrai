a=int(input())
b = list(map(int, input().split()))
max= float('-inf')
posi=-1

for i in range(len(b)):
    if b[i]>max:
        
        max=b[i]
        posi=i

    
print(f"{max} {posi}")