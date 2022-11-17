for test_case in range(1, 11):
    caseNum = int(input())
    searchS = input() # 검색 문자
    s = input() # 입력 문자
    print(f"#{caseNum} {s.count(searchS)}")