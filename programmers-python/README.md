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
