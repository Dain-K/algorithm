for test_case in range(1, 11):
    caseNum = input()
    sumArr = [0 for i in range(0, 210)]
    idx = 0
    sumA = 0  # 대각선 1
    sumB = 0  # 대각선 2
    for i in range(0, 100):
        num = list(map(int, input().split()))
        tmp = 101
        for j in range(0, len(num)):
            sumArr[idx] += num[j]
            sumArr[tmp] += num[j]
            tmp += 1
        idx += 1
        sumA += num[i]
        sumB += num[99 - i]
    sumArr.append(sumA)
    sumArr.append(sumB)
    sumArr.sort(reverse=True)
    print(f"#{caseNum} {sumArr[0]}")