def solution(n):
    answer = n + 1
    while True:
        n_cnt = bin(n)[2:]
        new_cnt = bin(answer)[2:]
        if str(n_cnt).count('1') == str(new_cnt).count('1'):
            break
        else:
            answer+=1
    return answer