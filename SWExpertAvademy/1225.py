for test_case in range(1, 11):
    caseNum = int(input())
    num = list(map(int, input().split()))
    isTrue = True
    idx = 1
    while isTrue:
        inputNum = num.pop(0) - idx
        if inputNum <= 0:
            inputNum = 0
            num.append(inputNum)
            isTrue = False
        else:
            num.append(inputNum)
        idx += 1
        if idx == 6:
            idx = 1
    s = ""
    for i in num:
        s += str(i) + " "
    print(f"#{caseNum} {s}")