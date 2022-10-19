def solution(strings, n):
    answer = []
    new_list = []
    for i in strings:
        tmp = i[n] + i
        new_list.append(tmp)
    new_list.sort()
    
    for i in new_list:
        tmp = i[1:]
        answer.append(tmp)
    
    return answer