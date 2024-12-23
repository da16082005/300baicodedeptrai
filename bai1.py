import math
a, b, c = map(int, input().split())
p = (a+b+c)/2
if a +b > c or b+ c > a or a+c > b:
    print("Day la 3 canh cua mot tam giac")
    print(f"{a+b+c:.2f} {math.sqrt(p*(p-a)*(p-b)*(p-c)):.1f}")
else:
    print("Day khong phai la 3 canh cua mot tam giac")
    
    




