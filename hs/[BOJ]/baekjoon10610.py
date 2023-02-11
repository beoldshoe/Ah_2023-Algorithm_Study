N = input()
result = 0
check = False
number = list()

for i in range(len(N)) :
    result = result + int(N[i])
    number.append(int(N[i]))
    if N[i] == '0' :
        check = True

number.sort(reverse=True)

if result % 3 == 0 :
    if check == True :
        print("".join(map(str,number)))
    else :
        print(-1)
else :
    print(-1)
    
