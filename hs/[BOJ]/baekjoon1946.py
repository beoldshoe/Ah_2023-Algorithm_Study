n = int(input())

for i in range(n) :
    a = int(input())
    arr = [0]*a
    count = 1
    for j in range(a) :
        rank1, rank2 = map(int, input().split())
        arr[j] = [rank1, rank2]
        
    arr_sorted = sorted(arr, key = lambda x : x[0])
    hired = arr_sorted[0][1]
    for j in range(1, a):
        if hired > arr_sorted[j][1] :
            count = count + 1
            hired = arr_sorted[j][1]
        else :
            count = count
    
    print(count)

                
        
        
        