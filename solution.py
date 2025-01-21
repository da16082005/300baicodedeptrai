num_list= list(map(int, input().split()))
target= int(input())
sign=['+']* len(num_list)
count=0

while len(sign) != 0:
    if len(sign)!= len(num_list):
        while len(sign)<len(num_list):
            sign.append('+')
    else:
        print(sign)
        sum=0
        i=0
        while i<len(num_list):
            if sign[i]=="+":
                sum+= 1*num_list[i]
            elif sign[i]=="-":
                sum+= -1*num_list[i]
            i+=1
        if sum== target:
            count+=1
            
    if sign[-1]=="+":
        sign[-1]="-"
    elif sign[-1]=="-":
        sign.pop()
print(count)

# 1)+ + + + + 
# 2) + + + + - 
# 3)+ + + - +
# 4)+ + + - -
# 5) + + - + +
# 6) + + - + -
# 7) + + - - +
# 8) + + - - -
# 9) + - + + +
# 10) + - + + -
# 11) + - + - +
# 12) + - + - -
# 13) + - - + +
# 14) + - - + -
# 15) + - - - +
# 16) + - - - -


