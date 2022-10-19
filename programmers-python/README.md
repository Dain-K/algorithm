<details>
<summary> :file_folder: len() </summary>
<div markdown="1">

## len() 으로 리스트 크기 확인

```py
my_list = []
print(len(my_list)) # 0

my_list = [1,2,3]
print(len(my_list)) # 3

my_tuple = (10, 22, 19, 23)
print(len(my_tuple)) # 4

my_dict = {1: 'a', 2: 'b'}
print(len(my_dict)) # 2

my_range = range(1, 10)
print(len(my_range)) # 9

str = 'Python'
print(len(str)) # 6

```

</div>
</detail>

<details>
<summary> :file_folder: List(리스트) - 정렬 </summary>
<div markdown="1">

## List 정렬

- reverse: 리스트를 거꾸로 뒤집음

```py
a = [4, 8, 9, 52, 1]
a.reverse()
a # [1, 52, 9, 8, 4]
```

- sort: 정렬, 기본값은 오름차순 정렬, reverse 옵션 True 는 내림차순

```py
a = [1,8,5,4,9]
a.sort()
a # [1,4,5,8,9]

a = [1,8,5,4,9]
a.sort(reverse =True)
a # [9,8,5,4,1]
```

- key 옵션

```py
m = '나는 파이썬을 잘하고 싶다'
m = m.split()
m # ['나는', '파이썬을', '잘하고', '싶다']
m.sort(key=len)
m #['나는', '싶다', '잘하고', '파이썬을']
```

</div>
</detail>

<details>
<summary> :file_folder: 최대공약수, 최소공배수 함수 </summary>
<div markdown="1">

## 최대공약수 math.gcd

```python
import math

a = math.gcd()
b = math.gcd(0, 2, 4)
c = math.gcd(10, 5, 100)

print(a) # 0
print(b) # 2
print(c) # 5
```

## 최소공배수 math.lcm()

```python
import math

a = math.lcm()
b = math.clm(0, 2, 4)
c = math.lcm(10, 5, 100)

print(a) # 1
print(b) # 0
print(c) # 100

```

</div>
</detail>

<details>
<summary> :file_folder: 스택(Stack), 큐(Queue) </summary>
<div markdown="1">

## 스택(Stack)

- 나중에 넣은 데이터가 먼저 반환되도록 설계한 메모리 구조
- 후입선출 Last in First Out(LIFO)
- 데이터의 입력은 Push, 데이터의 출력 Pop

#### :pushpin: 데이터의 입력: push -> append()

#### :pushpin: 데이터의 출력: pop -> pop()

### 스택이 지원하는 연산 목록

- push: 스택에 값을 넣는 연산
- pop: 스택에서 자료를 빼는 연산 (pop 으로 뽑아낸 데이터는 원래 리스트 내에서 없어짐)
- top: 스택의 가장 위에 있는 자료를 반환하는 연산
- empty: 스택이 비어있는지의 여부를 반환하는 연산

```py
a = [1,2,3,4,5]
a.append(6) ## a에 데이터 추가
a ## a 확인 [1,2,3,4,5,6]

a.pop() # a에 데이터 출력 6
a # a 확인 [1,2,3,4,5]

```

## 큐(Queue)

- 큐는 줄이라는 의미로, 줄을 먼저 선 데이터가 먼저 반환
- 선입선출 First in First Out(FIFO)
- 스택과 반대되는 개념
  <img src ="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2Fbpb1qc%2Fbtq2ES6nkVJ%2F9gzh1I8XHfYwfkcz64PlDk%2Fimg.png" width="100%">
- Enqueue: 큐에서 데이터를 입력하는 기능
- Dequeue: 큐에서 데이터를 꺼내는 기능
- 큐 역시 리스트 이용

#### :pushpin: push -> append()

#### :pushpin: get -> pop(0)

### 큐가 지원하는 연산 목록

- push: 큐에 값을 넣는 연산
- pop: 큐에서 자료를 빼는 연산
- front: 큐의 가장 앞에 있는 자료를 반환하는 연산
- back: 큐의 가장 뒤에 있는 자료를 반환하는 연산
- empty: 큐가 비어있는지의 여부를 반환하는 연산

```py
from collections import deque

queue = deque()

queue.append(5)
queue.append(2)
queue.append(3)
queue.append(7) #deque([5,2,3,7])
queue.popleft() #queue에 맨 첫번째 값인 5를 삭제(pop)한다. deque([2,3,7])
queue.append(1)
queue.append(4)	#deque([2,3,7,1,4])
queue.popleft() #맨 첫번째 값인 2를 삭제(pop)한다. deque([3,7,1,4])

print(queue) #deque([3,7,1,4])
print(list(queue)) #[3,7,1,4]

```

</div>
</detail>

<details>
<summary> :file_folder: key, value </summary>
<div markdown="1">

## 숫자 문자열과 영단어

```py
num_dic = {"zero":"0", "one":"1", "two":"2", "three":"3", "four":"4", "five":"5", "six":"6", "seven":"7", "eight":"8", "nine":"9"}

def solution(s):
    answer = s
    for key, value in num_dic.items():
        answer = answer.replace(key, value)
    return int(answer)
```

</div>
</detail>

<details>
<summary> :file_folder: isdigit() - 문자열이 숫자로만 이루어져 있는지 확인</summary>
<div markdown="1">

## str.isdigit()

- string 클래스에 있는 메서드
- 문자열이 숫자로만 이루어져 있는지 확인
- 단 하나라도 있다면 False 반환
- 소수점이나 음수를 나타내는 "-" 는 문자로 판단하기 때문에 실수나 음수를 판단하지 못함
- 오직 0을 포함한 양수형 정수로만 이루어진 문자열만 인식

</div>
</detail>

<details>
<summary> :file_folder: isalpha() - 알파벳으로 구성되어있는지 확인</summary>
<div markdown="1">

## isalpha()

- 알파벳으로 구성되어있는지 확인하는 메서드
- 숫자 및 공백이 포함되어 있으면 False를 리턴

```py
Ex1 = 'ABC'
Ex2 = '123asc'

print(Ex1.isalpha()) # true
print(Ex2.isalpha()) # false
```

</div>
</detail>
