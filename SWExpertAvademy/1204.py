T = int(input())
for test_case in range(1, T + 1):
    num = int(input())
    numList = input().split()
    countList = [0 for i in range(0, 101)]

    for i in range(0, len(numList)):
        countList[int(numList[i])] += 1
    maxNum = max(countList)
    result = 0
    for i in range(len(countList) - 1, 0, -1):
        if countList[i] == maxNum:
            result = i
            break
    print(f"#{num} {result}")