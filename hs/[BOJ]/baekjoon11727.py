n = int(input())
m = 0
result = 0

def Fact(number):
    ret = 1
    for i in range(1, number+1):
        ret *= i
    return ret

while(True) :
    a = (Fact(n))//(Fact(m))//(Fact(n-m))*(2**m)
    result = result + a
    n = n - 1
    m = m + 1
    if n < m :
        break
   
print(int(result%10007))
