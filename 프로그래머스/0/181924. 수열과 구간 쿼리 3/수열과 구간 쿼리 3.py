def solution(arr, queries):
    
    for i in queries:
        a1 = i[0]
        a2 = i[1]
        arr[a1], arr[a2] = arr[a2], arr[a1]
        
    return arr