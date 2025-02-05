a=[]
min1=float("inf")
min2=float("inf")
min3=float("inf")

while True:
    b=int(input())
    a.append(b)
    if b == "":  
        break

if len(a)<3: 
    print('-')
for i in range(len(a)):
    if a[i]>min1:
        min3=min2
        min2=min1
        min1=a[i]
    elif a[i]>min2:
        min3=min2
        min2=a[i]
    elif a[i]>min3:
        min3=a[i]

