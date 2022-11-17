T = int(input())
for test_case in range(1, T + 1):
    tmp = input().split()
    length = int(tmp[1])
    num = input().split()
    dic = {"ZRO": 0, "ONE": 1, "TWO": 2, "THR": 3, "FOR": 4, "FIV": 5, "SIX": 6, "SVN": 7, "EGT": 8, "NIN": 9}
    dicNum = {0: "ZRO", 1: "ONE", 2: "TWO", 3: "THR", 4: "FOR", 5: "FIV", 6: "SIX", 7: "SVN", 8: "EGT", 9: "NIN"}
    numList = []
    result = ""
    for i in num:
        numList.append(dic[i])
    numList.sort()
    for i in numList:
        result += dicNum[i] + " "
    print(f"{tmp[0]} {str(result)}")