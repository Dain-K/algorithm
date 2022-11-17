for test_case in range(1, 11):
    squareSize = int(input())
    num = [list(map(int, input().split()))for _ in range(squareSize)]
    numArr = [[num[j][i] for j in range(100)] for i in range(100)]
    result = 0

    for i in range(0, 100):
        numList = []
        for j in range(0, 100):
            if numList == [] and numArr[i][j] == 1:
                numList.append(1)
            if numList != []:
                if numList[-1] == 2 and numArr[i][j] == 1:
                    numList.append(1)
                if numList[-1] == 1 and numArr[i][j] == 2:
                    numList.append(2)
        result += len(numList) // 2


    print(f"#{test_case} {result}")