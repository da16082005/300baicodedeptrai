a = set()

while True:
    try:
        b = input()
    except Exception:
        break
    if b == "":
        break
    b=int(b)
    
    
    a.add(b)
print(len(a))

        
    
        

