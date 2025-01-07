import math
def is_square_number(n):
    root = math.isqrt(n)
    if root * root == n:
        return "Yes"
    else:
        return "No"
n = int(input())
if n > 0:
    print(is_square_number(n))