a=input()
ls=[]
i=0
while i < len(a):
    if a[i]== "("or a[i]== "{"or a[i]=="[":
        ls.append(a[i])
    elif a[i]=="}":
        if ls[-1]== "{":
            ls.pop()
        else:
            print('false')
    elif a[i]=="]":
        if ls[-1]=="(":
            ls.pop()
        else:
            
    elif a[i]==")":
        if ls[-1]=="(":
            ls.pop()
        else: 
            return False
    


