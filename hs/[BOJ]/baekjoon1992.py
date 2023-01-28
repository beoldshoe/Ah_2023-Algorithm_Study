n = int(input())

array = list()

for i in range(n) :
        array.append(input())
    
result = list()
def dividing(a, b, c, d, array):
    check = 1
    for i in range(a,b):
        for j in range(c,d):
            if array[a][c]!=array[i][j]:
                check = 0  
            else :
                a = a    
    if check == 1 :
        result.append(array[a][c])
    else :
        result.append('(')
        dividing(a,(a+b)//2,c,(c+d)//2, array)
        dividing(a,(a+b)//2,(c+d)//2,d, array)
        dividing((a+b)//2,b,c,(c+d)//2, array)
        dividing((a+b)//2,b,(c+d)//2,d, array)
        result.append(')')
dividing(0,n,0,n,array)

print(''.join(result))