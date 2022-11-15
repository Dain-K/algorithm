import math

T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    # ///////////////////////////////////////////////////////////////////////////////////
    t = input()
    s = t.split()
    len1 = len(s[0])
    len2 = len(s[1])
    if len1 == len2:
        if s[0] == s[1]:
            print(f"#{test_case} yes")
        else:
            print(f"#{test_case} no")
    else:
        s[1] = s[1] * int(len1 / math.gcd(len1, len2))
        s[0] = s[0] * int(len2 / math.gcd(len1, len2))
        
        if s[0] == s[1]:
            print(f"#{test_case} yes")
        else:
            print(f"#{test_case} no")
    # ///////////////////////////////////////////////////////////////////////////////////