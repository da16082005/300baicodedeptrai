m,n = map(int, input().split())
tong=0
for i in range(m,n+1):
    if i%3==0:
        tong+=1
print(tong)

