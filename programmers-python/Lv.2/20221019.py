def solution(s):
    answer = ''
    tmp = s.split()
    maxNum = -99999
    minNum = 99999
    for i in tmp:
        if maxNum < int(i):
            maxNum = int(i)
        if minNum > int(i):
            minNum = int(i)
            
    answer = str(minNum) + " " + str(maxNum)
    
    return answer