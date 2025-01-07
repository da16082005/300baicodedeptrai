def find_gcf(a, b):
    gcf = 1
    for i in range(1, min(a, b) + 1):
        if a % i == 0 and b % i == 0:
            gcf = i
    return gcf
m,n = map(int, input().split())
print(find_gcf(m, n))