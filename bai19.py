a=int(input())
total=0

while a>0:
    hi= a%10
    total+=hi
    a=a//10
sd=total%10

print(sd)
if  sd==9:
    print('may man')
else:
    print('chua may man')
