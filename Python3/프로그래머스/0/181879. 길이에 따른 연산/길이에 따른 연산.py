def solution(num_list):
    
    if len(num_list) >= 11:
        answer = 0
        for _ in num_list:
            answer += _
        return answer
    else:
        answer = 1
        for _ in num_list:
            answer *= _
        return answer
    