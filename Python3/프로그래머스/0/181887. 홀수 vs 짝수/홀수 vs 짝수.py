def solution(num_list):
    answer = 0
    even_sum = 0
    odd_sum = 0
    
    for _ in range(len(num_list)):
        if _ % 2 == 0:
            even_sum += num_list[_]
        else:
            odd_sum += num_list[_]
    
    if even_sum > odd_sum:
        answer = even_sum
    else: 
        answer = odd_sum
        
    return answer