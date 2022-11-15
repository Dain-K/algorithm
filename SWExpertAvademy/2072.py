T = int(input())
for test_case in range(1, T + 1):
    s_input = input()
    s = s_input.split()
    sumAll = 0
    for num in s:
        if int(num) % 2 == 1:
            sumAll += int(num)
    print(f"#{test_case} {sumAll}")