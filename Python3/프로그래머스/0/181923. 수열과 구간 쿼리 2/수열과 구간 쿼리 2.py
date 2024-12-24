def solution(arr, queries):    
    answer = []
#     queries의 0,1번 인덱스 사이에 있는 값중에 3번 인덳 값보다 큰 값을 추림 - 그중 작은값 답에 넣고 없으면 -1 넣음 그걸 모두 순회 할동안 한다.
    for j in queries:
        query_list = [arr[i] for i in range(j[0], j[1]+1) if arr[i] > j[2]]
        if query_list:
            min_value = min(query_list)
            answer.append(min_value)
        else:
            answer.append(-1)
        
    return answer
            
        