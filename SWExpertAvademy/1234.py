for test_case in range(1, 11):
    inputNum = list(input().split())
    isFinished = True
    numList = list(map(int, inputNum[1]))
    while isFinished:
        for i in range(0, len(numList) - 1):
            if numList[i] == numList[i+1]:
                numList = numList[:i] + numList[i+2:]
                break
            if i == (len(numList) - 2):
                isFinished = False
                break
        #print(numList)
    #print(numList)
    print(f"#{test_case} {''.join(map(str, numList))}")