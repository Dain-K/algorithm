def solution(s):
    compareList = []
    for i in s:
        if i == '(':
            compareList.append(i)
        else:
            if compareList == []:
                return False
            else:
                compareList.pop()
    return compareList == [] 