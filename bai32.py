m,n = map(int, input().split())
tong1=0
tong2=0
for i in range(m,n+1):
    if i%3==0 or i%5 ==0:
        tong1+=1
    if i%2==0:
        tong2+=i
print(f'{tong1} {tong2}')
