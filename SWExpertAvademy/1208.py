for cnt in range(1, 11):
    dumpCnt = int(input())
    box = list(map(int, input().split()))
    for i in range(0, dumpCnt):
        box[box.index(max(box))] -= 1
        box[box.index(min(box))] += 1
    result = max(box) - min(box)
    print(f"#{cnt} {result}")