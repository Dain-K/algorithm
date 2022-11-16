for cnt in range(1, 11):
    num = int(input())
    building = input().split()
    sumBuild = 0
    for i in range(2, len(building) - 2):
        k = max(int(building[i-1]), int(building[i-2]), int(building[i+2]), int(building[i+1]))
        if int(building[i]) < k:
            continue
        else:
            sumBuild += (int(building[i]) - k)
    print(f"#{cnt} {sumBuild}")