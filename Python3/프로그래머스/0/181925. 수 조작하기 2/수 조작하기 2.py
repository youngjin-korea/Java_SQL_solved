def solution(numLog):
    answer = ''
    
    for _ in range(1, len(numLog)):
        if numLog[_] - numLog[_-1] == 1:
            answer += "w"
        elif numLog[_] - numLog[_-1] == -1:
            answer += "s"
        elif numLog[_] - numLog[_-1] == 10:
            answer += "d"
        elif numLog[_] - numLog[_-1] == -10:
            answer += "a"
        
    
    return answer