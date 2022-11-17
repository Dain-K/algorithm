for test_case in range(1, 11):
    caseNum = int(input())
    arr1 = [list(input()) for _ in range(100)]
    arr2 = [[arr1[j][i] for j in range(100)] for i in range(100)]
    result = 0
    for z in range(100, 0, -1):
        for i in range(0, 100):
            for j in range(0, 100 - z + 1):
                text1 = arr1[i][j:j + z]
                text2 = arr2[i][j:j + z]
                if text1 == text1[::-1]:
                    result = z
                    break
                if text2 == text2[::-1]:
                    result = z
                    break
            if result != 0:
                break
        if result != 0:
            break
    print(f"#{caseNum} {result}")