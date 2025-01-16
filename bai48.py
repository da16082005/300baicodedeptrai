a=int(input())
b = list(map(int, input().split()))
i=0
count=[]
while i < len(b):
    if b[i]%5==0:
        count.append(b[i])
    i+=1
if len(count)==0:
    print('-')
    print(0)
else:
    print(" ".join(map(str,count)))
    print(sum(count))


