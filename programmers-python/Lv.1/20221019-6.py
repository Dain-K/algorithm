def solution(s):
    answer = 0
    num = ["0","1","2","3","4","5","6","7","8","9"]
    alpha = ["zero","one","two","three","four","five","six","seven","eight","nine"]
    for i in range(len(num)):
        s = s.replace(alpha[i], num[i])
    answer = int(s)
    return answer