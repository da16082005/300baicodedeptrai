a=int(input())
b = list(map(int, input().split()))
max=0
i=0
posi=0
while i < len(b):
    if b[i]>max:
        
        max==b[i]
        posi==i

    i+=1
print(f"{max} {posi}")