a, b = map(int, input().split())
c=[1,3,5,7,8,10,12]
d=[4,6,9,11]
if a in c:
    print(31)
elif a in d:
    print(30)
elif a ==2:
    if b %4 ==0 and b%100 !=0:
        print(29)
    elif b %400==0:
        print(29)
    else:
        print(28)
