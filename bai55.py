a = list(map(int, input().split()))

max1=float('-inf')
max2=float('-inf')
if len(a)<2:
    print('-')
for i in range(len(a)):
    if a[i]>max1:
        max2=max1
        max1=a[i]
        
    elif a[i]>max2 and a[i]<max1:
        max2=a[i]
print(max2)