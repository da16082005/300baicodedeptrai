import math
m,n = map(int, input().split())
o=math.gcd(m,n)
print(f"{int(m/o)}/{int(n/o)}")