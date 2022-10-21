a = input()
newList = []
result = 0
for i in range(0, int(a)):
  n = input()
  if int(n) == 0:
    newList.pop()
  else:
    newList.append(n)
for i in newList:
  result += int(i)
print(result)