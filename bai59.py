a=int(input())
b={}
max_value = float('-inf')
max_key=0
for i in range(a):
    c=int(input())
    
    if c not in b.keys():
        b.update({c:1})
    else:
        b[c]+=1
        
for key, value in b.items():
    if value >max_value:
        max_value = value
        max_key = key
print(f'{max_key} {max_value}')