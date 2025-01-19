a= list(map(int, input().split()))
result=[0]* len(a)
i=1
st=[[0]]
while i< len(a):
    j=0
    while j <len(st):
        if a[i]>= a[st[j][-1]]:
            result[st[j][-1]]= i - st[j][-1]
            st[j].append(i)
        else:
            st.append([i])

        j+=1
    i+=1
print(result)

    
