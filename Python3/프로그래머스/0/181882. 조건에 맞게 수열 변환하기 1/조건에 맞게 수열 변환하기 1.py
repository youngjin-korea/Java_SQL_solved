def solution(arr):
    answer = []
    for _ in  range(len(arr)):
        atom = arr[_]
        if atom >= 50 and atom % 2 == 0:
            answer.append(atom//2)
        elif atom < 50 and atom % 2 == 1:
            answer.append(atom * 2) 
        else:
            answer.append(atom)
    return answer