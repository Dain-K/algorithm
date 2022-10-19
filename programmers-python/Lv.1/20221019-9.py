def solution(num):
    answer = -1
    for i in range(0,500):
        if num == 1:
            answer = 0
            break
        if num % 2 == 0:
            num /= 2
        else:
            num = num * 3 + 1
        if num == 1:
            answer = i + 1
            break
                
    return answer