for test_case in range(1, 11):
    length = int(input())
    arr1 = [list(input()) for _ in range(8)]
    arr2 = [[arr1[j][i] for j in range(8)] for i in range(8)]
    cnt = 0
    for i in range(0, 8):
        for j in range(0, 8 - length + 1):
            text1 = arr1[i][j:j + length]
            text2 = arr2[i][j:j + length]
            if text1 == text1[::-1]:
                cnt += 1
            if text2 == text2[::-1]:
                cnt += 1
    print(f"#{test_case} {cnt}")