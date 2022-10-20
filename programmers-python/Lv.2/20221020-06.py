def solution(brown, yellow):
    for i in range(1, brown):
        if yellow % i == 0:
            height = yellow / i
            total = height * 2 + i * 2 + 4
            if(brown == total):
                answer = [height + 2, i + 2]
                break
    return answer