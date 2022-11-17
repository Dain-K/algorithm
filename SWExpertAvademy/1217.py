for test_case in range(1, 11):
    caseNum = int(input())
    num = list(map(int, input().split()))
    result = 1
    for i in range(0, num[1]):
        result *= num[0]
    print(f"#{caseNum} {result}")