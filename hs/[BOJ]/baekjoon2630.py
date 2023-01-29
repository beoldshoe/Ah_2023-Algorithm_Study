n = int(input())

arr = []

for i in range(n):
    arr.append(list(map(int, input().split())))

white_count = 0
blue_count = 0

def calcul(a, b, c, d, arr) :
    global white_count
    global blue_count
    check = 1
    for i in range(a,b):
        for j in range(c,d):
            if arr[a][c] != arr[i][j]:
                check = 0
            else :
                a = a
    if check == 1 :
        if arr[a][c] == 0 :
            white_count = white_count + 1
        else :
            blue_count = blue_count + 1
    else :
        calcul(a, (a+b)//2, c, (c+d)//2, arr)
        calcul(a, (a+b)//2, (c+d)//2, d, arr)
        calcul((a+b)//2, b, c, (c+d)//2, arr)
        calcul((a+b)//2, b, (c+d)//2, d, arr)
    return
        
calcul(0, n, 0, n, arr)
        
print(white_count)
print(blue_count)
     

