def solution(n):
    answer = 0
    f0 = 0
    f1 = 1
    for i in range(n-1):
        f = f0 + f1
        f0 = f1
        f1 = f
    answer = f % 1234567
    
    return answer