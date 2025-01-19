a=int(input())
b = list(map(int, input().split()))
max=0
i=0
result=[]

while i < len(b):
    if b[i]>max:
        
        max==b[i]
        result.append(max)
    i+=1
print(" ".join(map(str, result)))