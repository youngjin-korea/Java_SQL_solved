def solution(strArr):
    answer = []
    for _ in range(0, len(strArr)):
        sol = _%2
        if sol == 0:
            answer.append(strArr[_].lower())
        elif sol == 1:
            answer.append(strArr[_].upper())
    return answer