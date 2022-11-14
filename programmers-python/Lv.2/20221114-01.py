def solution(s):
    answer = 0
    for i in range(len(s)):
        Mylist = []
        index = True
        for st in s:
            if st == "[" or st == "(" or st == "{":
                Mylist.append(st)
            else:
                if Mylist == []:
                    index = False
                else:
                    if st == "]" and Mylist[-1] == "[" :
                        Mylist.pop()
                    elif st == "}" and Mylist[-1] == "{":
                        Mylist.pop()
                    elif st == ")" and Mylist[-1] == "(":
                        Mylist.pop()
                    else:
                        index = False
        if index == True and Mylist == []:
            answer += 1
        s = s[1:] + s[0]
    return answer