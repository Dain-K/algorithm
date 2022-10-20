def solution(s):
    answer = []
    result = 0
    zero = 0
    
    while True:
        cnt = s.count('0')
        s = s.replace('0' , '')
        length = len(s)
        
        s = bin(length)[2:]
        result += 1
        zero += cnt
        if len(s) == 1:
            answer.append(result)
            answer.append(zero)
            break
            
    print(cnt)
    return answer