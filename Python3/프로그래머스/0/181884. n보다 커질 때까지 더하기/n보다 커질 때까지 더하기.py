def solution(numbers, n):
    answer = 0
    for _ in numbers:
        if answer > n:
            return answer
        answer += _
    return answer