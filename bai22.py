a= int(input())
if a <=50:
    b=a*600
    print(b)
elif a >50 and a <= 100:
    b= 50* 600+(a-50)*800
    print(b)
elif a >100 and a <=200:
    b= 50 *600 + 50*800+(a-100)*1100
    print(b)
elif a >200:
    b= 50 *600 + 50*800+ 100*1100+(a-200)*1500
    print(b)