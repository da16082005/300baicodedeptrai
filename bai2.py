TBHKI, TBHKII = map(int, input().split())
TBCN=(TBHKI+(TBHKII*2))/3
print(f"{TBCN:.1f}")
if TBCN >= 8:
    print("Gioi")
elif TBCN <8 and TBCN >=6.5:
    print("Kha")
elif TBCN < 6.5 and TBCN >= 5.0:
    print("Trung binh")
elif TBCN <5 and TBCN >= 3.5:
    print('Yeu')
else:
    print("Kem")





