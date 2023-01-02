# Java Study

<details>
<summary> :pencil: 문자길이 구하기  </summary>
<div markdown="1">

## int 자리수 구하기

```java
int n = 1234;
int length = (int)(Math.log10(n) + 1);

System.out.println("length: " + length);
```

## string 문자 길이 구하기

```java
String s = "abcde";

System.out.println("length: " + s.length());
```

</div>
</details>

<details>
<summary> :pencil: 조건문 축약 사용  </summary>
<div markdown="1">

## 조건문 사용하기

```java
public class EvenOrOdd {
    String evenOrOdd(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();

        System.out.println("결과: " + evenOrOdd.evenOrOdd(2));
        System.out.println("결과: " + evenOrOdd.evenOrOdd(3));
    }
}
```

</div>
</details>

### :pushpin: 형변환

<details>
<summary> :pencil: String to int  </summary>
<div markdown="1">

## String to int

### Integer.parseInt

```java
String a = "10";
int num = Integer.parseInt(a);
```

### Integer.valueOf

```java
String str = "10";
int num = Integer.valueOf(str);
```

</div>
</details>

<details>
<summary> :pencil: Int to String  </summary>
<div markdown="1">

## Int to String

### String.valueOf

```java
int num = 10;
String str = String.valueOf(num);
```

### String.toString

```java
int num = 10;
String str = String.toString(num);
```

</div>
</details>

<details>
<summary> :pencil: Char to Int </summary>
<div markdown="1">

## Char to Int

### Character.getNumericValue

```java
char c = '9';
int num1 = Character.getNumericValue(c);
```

</div>
</details>

<details>
<summary> :pencil: Int to Char </summary>
<div markdown="1">

## Int to Char

### (char)

```java
int num = 5;
char c = (char) num;
```

### Integer.toString().charAt()

Stirng으로 변환한 다음 char로 변환

```java
int num = 5;
char c = Integer.toString(num).charAt(0);
```

</div>
</details>

<details>
<summary> :pencil: Char to String </summary>
<div markdown="1">

## Char to String

### String.valueOF()

```java
char[] cArr = {'김', '다', '인'};
String str = String.valueOf(cArr);

System.out.println(str);
```

### String 클래스 생성자 이용

- new String(char 배열, 시작 index, 끝 index)

```java
char[] cArr = {'김', '다', '인'};
String str = new String(cArr, 1, 2);

System.out.print(str);
```

</div>
</details>

<details>
<summary> :pencil: String to Char  </summary>
<div markdown="1">

## String to Char

### charAt

```java
String str = "DAIN";
char c = str.charAt(0);
System.out.print("출력 : " + c);
```

### toCharArray

```java
String str = "DAIN";
char [] cArr = str.toCharArray();
for(int i=0 ; i<cArr.length ; i++)
{
	System.out.print(cArr[i] + " ");
}
```

</div>
</details>

### :pushpin: String

<details>
<summary> :pencil: String  </summary>
<div markdown="1">

## long 타입을 string 으로 변환

- String.valueOf()
  - 파라미터가 null 이면 문자열 null 을 만들어서 담음
- Casting
  - 대상이 null 이면 MullPointerException 발생
  - Object 값이 String 이 아니면 ClassCastException 발생
- "".toString()
  - 대상이 null 이면 MullPointerException 발생
  - Object 에 담긴 값이 String 이 아니라도 출력

### :one: 덧셈연산자

두개의 피연산자 중 어느 한쪽이라도 string 이면 연산 결과는 string 이 된다.

```java
public class StringCasting {

    public static void main(String[] args) {
        String s = "" + n;
    }
}
```

### :two: String.valueOf()

```java
public class StringCasting {

    public static void main(String[] args) {
        int num = 123;
        String strValue = String.valueOf(num);

        long num2 = 12345;
        String strValue = String.valueOf(num2); // long 을 string 으로 변환
    }
}
```

## long 을 string 으로 변환 후 뒤집기

```java
class Solution {

    public int[] solution(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuiler(s);
        sb = sb.reverse();
        String[] ss = sb.toString().split("");

        int[] answer = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            answer[i] = Integer.parseInt(ss[i]);
        }

        return answer;
    }
}
```

</div>
</details>

<details>
<summary> :pencil: String charAt() 메소드 - 특정 위치의 문자 확인  </summary>
<div markdown="1">

## charAt()

문자열에서 특정 위치의 문자가 무엇인지 확인하는 메소드

```java
public class GetNumerValueEx {

    public static void main(String[] args) {
        String s = "Hello java";

        char ca = s.charAt(0);
        char cb = s.charAt(1);
        char cc = s.charAt(2);

        System.out.println("첫번째 문자: "+ ca);
        System.out.println("두번째 문자: "+ cb);
        System.out.println("세번째 문자: "+ cc);
    }
}
```

</div>
</details>

<details>
<summary> :pencil: String toUpperCase() - 문자열 모두 대문자  </summary>
<div markdown="1">

## toUpperCase()

대상 문자열을 모두 대문자로 변환

```java
String str1 = "hello java"

System.out.println(str1.toUpperCase());
// 출력: HELLO JAVA
```

</div>
</details>

<details>
<summary> :pencil: String toLowerCase() - 문자열 모두 소문자  </summary>
<div markdown="1">

## toLowerCase()

대상 문자열을 모두 소문자로 변환

```java
String str1 = "HELLO JAVA"

System.out.println(str1.toLowerCase());
// 출력: hello java
```

</div>
</details>

<details>
<summary> :pencil: String trim() - 앞 뒤 공백 제거  </summary>
<div markdown="1">

## trim()

대상 문자열의 앞 뒤 공백 문자를 모두 제거하여 리턴해준다.

```java
String str1 = "   공백 제거   ";

System.out.println(str1.trim());
// 출력: 공백 제거
```

</div>
</details>

<details>
<summary> :pencil: String equals() - 문자 동일한지 비교  </summary>
<div markdown="1">

## equals()

- 가지고 있는 값이 동일하면 true 출력
- == 을 사용하면 주소값을 비교

### ==

```java
Stirng str1 = "Hello";
Stirng str2 = "Hello";
Stirng str3 = new String("Hello");

System.out.println(str1 == str2); // true
System.out.println(str1 == str3); // false
```

### A.equals(B)

```java
Stirng str1 = "Hello";
Stirng str2 = "Hello";
Stirng str3 = new String("Hello");

System.out.println(str1.equals(str2)); // true
System.out.println(str1.equals(str3)); // true
```

- object 에서 사용하면 위와 같이 결과가 제대로 나오지 않는다.

</div>
</details>

<details>
<summary> :pencil: String substring() -   </summary>
<div markdown="1">

## substring()

-

</div>
</details>

### :pushpin: char

<details>
<summary> :pencil: char getNumericValue()  </summary>
<div markdown="1">

## getNumericValue()

```java
public class GetNumerValueEx {

    public static void main(String[] args) {
        String s = "342"

        char ca = s.charAt(0);
        char cb = s.charAt(1);
        char cc = s.charAt(2);

        int ia = Character.getNumericValue(ca);
        int ib = Character.getNumericValue(ca);
        int ic = Character.getNumericValue(ca);

        System.out.println(ia + ib + ic);
    }
}
```

</div>
</details>

### :pushpin: Arrays

<details>
<summary> :pencil: Arrays.sort() - 정렬 </summary>
<div markdown="1">

## Arrays.sort()

- java.util.Arrays 클래스
- 정렬 메소드
- Arrays 클래스는 배열의 복사, 항목 정렬, 검색과 같은 배열 조작 기능을 가지고 있음

### :one: 오름차순 정렬

```java
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[] = {9, 8, 47, 6, 15, 0, 90};
        Arrays.sort(arr);

        for(int i: arr) {
            System.out.println(i);
        }
    }
}
```

### :two: 내림차순 정렬

```java
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[] = {9, 8, 47, 6, 15, 0, 90};
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i: arr) {
            System.out.println(i);
        }
    }
}
```

### :three: 부분 정렬

시작 index, 끝 index를 넣어 일부분만 정렬할 수 있다.

```java
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[] = {9, 8, 47, 6, 15, 0, 90};
        Arrays.sort(arr, 0, 4);

        for(int i: arr) {
            System.out.println(i);
        }
    }
}
```

</div>
</details>

<details>
<summary> :pencil: string Arrays.asList().contains() - 배열에 특정 문자 포함되어있는지  </summary>
<div markdown="1">

## Arrays.asList(yourArray).contains(yourValue)

스트링 배열에서 특정 문자열이 포함되어있는지 확인하기

```java
import java.util.Arrays;

public class ContainsTest {

    public static void main(String[] args) {
        Arrays.asList("gif", "png", "jpg", "bmp").contains("exe"); // false
        Arrays.asList("gif", "png", "jpg", "bmp").contains("png"); // true
        Arrays.asList("gif", "png", "jpg", "bmp").contains("bat"); // false
    }
}
```

</div>
</details>

### :pushpin: List

<details>
<summary> :pencil: List 와 ArrayList  </summary>
<div markdown="1">

## List 와 ArrayList

- `List` = Interface
- `ArrayList` = Class <br/>
  > List 와 ArrayList의 가장 큰 차이는 크기가 정해져 있지 않고 동적으로 변한다. <br/>
  > 예를 들어, 배열의 크기가 5라면 5개 이상의 값을 담을 수 없지만 list는 크기가 정해져있지 않아 원하는 만큼 값을 담을 수 있다. <br/>
  > List 에는 ArrayList, Vector, LinkedList 등의 인터페이스를 구현한 자료형이 있다. <br/>
  > 즉, List 인터페이스 안에 ArrayList 클래스가 포함되어 있다.

```java
List<자료형> list = new ArraryList<>();
ArrayList<자료형> list = new ArrayList<>();
```

</div>
</details>

<details>
<summary> :pencil: ArrayList add() - 인덱스 추가  </summary>
<div markdown="1">

## add()

```java
// List<String> pitches = new ArrayList<>();
ArrayList pitches = new ArrayList();

// 삽입할 위치 지정
pitches.add(0, "123");
```

</div>
</details>

<details>
<summary> :pencil: ArrayList get() - 특정 인덱스의 값을 추출  </summary>
<div markdown="1">

## get()

```java
System.out.println(pitches.get(1));
```

</div>
</details>

<details>
<summary> :pencil: ArrayList size() -  ArrayList의 갯수를 리턴  </summary>
<div markdown="1">

## size()

```java
System.out.println(pitches.size());
```

</div>
</details>

<details>
<summary> :pencil: ArrayList contains() -  리스트 안에 항목이 있는지 판별  </summary>
<div markdown="1">

## contains()

```java
System.out.println(pitches.contains("123"));
// 포함된 값일 경우 true 반환
```

</div>
</details>

<details>
<summary> :pencil: ArrayList remove() -  리스트 객체에 해당되는 항목을 삭제  </summary>
<div markdown="1">

## remove()

- 객체

```java
System.out.println(pitches.remove("123"));
// 삭제한 결과 true, false 를 리턴
```

- 인덱스

```java
System.out.println(pitches.remove(0));
// 삭제한 결과 삭제한 항목을 리턴
```

</div>
</details>

<details>
<summary> :pencil: ArrayList indexOf() - 리스트에 동일한 객체가 있는지 검색  </summary>
<div markdown="1">

## ArrayList.indexOf()

- indexof(object o)는 인자로 객체를 받는다.
- 리스트의 안쪽부터 인자와 동일한 객체가 있는지 찾는다.
- 존재하면 그 인덱스를 리턴한다.
- 존재하지 않는다면 -1 리턴한다.

### example :one:

```java
String[] fruitsArr = {"apple", "banana", "apple", "mango"};
ArrayList<String> fruits = new ArrayList<>(Arrays.asList(fruitsArray));
System.out.println("indexOF(apple): " + fruits.indexOf("apple")); // 0
System.out.println("indexOF(kiwi): " + fruits.indexOf("kiwi")); // -1
```

### example :two:

```java
int[] arr = {1,8,5,69,75,15,10};

int cellsIndex = Arrays.asList(arr).indexOf(75);
System.out.println("searched index " + cellsIndex); // 0
```

</div>
</details>

### :pushpin: 문자열의 특정 인덱스 값 치환 방법

<details>
<summary> :pencil: String substring() - 문자열의 특정 인덱스 값 치환  </summary>
<div markdown="1">

## substring()

- String.substring(int, int)

</div>
</details>

<details>
<summary> :pencil: String StringBuilder setCharAt() - 문자열의 특정 인덱스 값 치환  </summary>
<div markdown="1">

## setCharAt()

- 문자열의 특정 인덱스에 있는 문자를 효율적으로 교체

```java
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        StringBuilder sb = new StringBuilder(phone_number);

        for(int i = 0; i < length - 4; i++){
            sb.setCharAt(i, '*');
        }
        answer = sb.toString();
        return answer;
    }
}
```

</div>
</details>

<details>
<summary> :pencil: Char toCharArray(), string valueOf() - 문자열의 특정 인덱스 값 치환  </summary>
<div markdown="1">

## 문자열의 특정 인덱스 값 치환

```java
class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = "_";
        int pos = 5;

        // 주어진 문자열을 문자 array 로 치환
        char[] chars = str.toCharArray();

        // char array의 지정된 위치에 있는 문자 교체
        chars[pos] = ch;

        // 문자 array을 다시 문자열로 치환
        str = String.valueOf(chars);
    }
}
```

</div>
</details>

<details>
<summary> :pencil: String 내림차순 정렬 방법  </summary>
<div markdown="1">

## String 내림차순 정렬 방법

```java
import java.util.Arrays;

public class ReverStr {
    public String reversStr(String str){
        char[] ch = str.thCharArray();
        Arrays.sort(ch);
        return new StringBuilder(new String(ch)).reverse().toString();
    }
}
```

</div>
</details>

<details>
<summary> :pencil: String 문자열에 숫자만 존재하는지 확인 방법 </summary>
<div markdown="1">

## matches()

```java
final String REGEX = "[0-9]+";
String test = "1234";

if(test.matches(REGEX)) {
    System.out.println("숫자만 있습니다.");
}else{
    System.out.println("숫자 외에 다른 값이 존재합니다.");
}
```

</div>
</details>

### :pushpin: Hash

<details>
<summary> :pencil: Hash </summary>
<div markdown="1">

## Hash?

- ArrayList 는 내부 인덱스를 이용하여 검색이 한번에 이루어지기 때문에 빠른 검색 속도를 보장하는 반면, 데이터의 추가 삭제 시 많은 데이터가 밀리거나 당겨지기 때문에 많은 시간이 소요
- LinkedList 는 추가 삭제 시 인근 노드들의 참조값만 수정해줌으로써 처리가 가능하지만 데이터를 검색할 경우, 해당 노드를 찾기 위해 처음부터 순회 검색을 해야하기 때문에 데이터의 수가 많아질수록 효율이 떨어지는 구조
- 이러한 한계를 극복하기 위해 제시된 방법 -> `Hash`
- Hash는 내부적으로 배열을 사용하여 데이터를 저장하므로 빠른 검색속도를 가짐
- 데이터 추가 삭제 시 기존 데이터를 밀어내거나 당기는 작업이 필요없도록 특별한 알고리즘을 이용하여 데이터와 연관된 고유한 숫자를 만들어 낸 뒤 이를 인덱스로 사용
- Hash가 내부적으로 사용하는 배열을 Hash Table 이라고 하며 크기에 따라 성능차이가 날 수 있음

## Hash Table?

- key-value 에서 key를 테이블에 저장할 때 key 값을 Hash Method를 이용하여 계산 수행, 그 결과값을 배열의 인덱스로 사용하여 저장하는 방식

## HashSet

- null 값 허용
- :star: 중복을 허용하지 않음

### 중복을 어떻게 제거하는가?

객체를 저장하기 전에 객체의 hashCode() 메소드를 호출해서 해시코드를 얻어 낸 후 다음 저장되어 있는 객체들의 해시 코드와 비교한 뒤 같은 해시 코드가 있다면 다시 equals() 메소드로 두 객체를 비교하여 true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않는다.

### HashSet 변수 선언

- HashSet<데이터타입> 변수명 = new HashSet<데이터타입>();

```java
HashSet<integer> set = new HashSet<Integer>();
HashSet<String> set2 = new HashSet<string>();
```

### HashSet 값 추가

- add(value) 메소드를 사용하여 값을 추가

```java
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1)'
    }
}
```

### HashSet 값 삭제

- remove(value) 메소드를 사용하면 원하는 value 값만 삭제

```java
public class HashSetTest {
    public static void main(String[] args) {
        // Integer
        HashSet<Integer> set = new HashSet<Integer>();
        set.remove(1);
        set.clear();
    }
}
```

### HashSet 값 크기 구하기

- size() 메소드를 사용하여 현재 HashSet의 크기를 구할 수 있음
- 중복값이 들어오면 자동으로 제거

```java
public class HashSetTest {
    public static void main(String[] args) {
        // Integer
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println("set의 크기: " + set.size()); // 출력: 3
    }
}
```

### HashSet 데이터 출력하기

- 하나의 객체를 가져오고 싶을 경우 Iterator를 사용하여 가져올 수 있음

```java
public class HashSetTest {
    public static void main(String[] args) {
        // Integer
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println("set의 크기: " + set.size()); // 출력: 3

        // Integer 출력
        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            System.out.print(ler.next() + " " );
        }
    }
}
```

### HashSet 검색하기

- 내부의 원하는 값을 검색할 경우 contains(value) 메소드를 사용

```java
public class HashSetTest {
    public static void main(String[] args) {
        // Integer
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println("1이 있는가: " + set.contains(1)); // 출력: true


        }
    }
}
```

</div>
</details>

### :pushpin: Stack

<details>
<summary> :pencil: Stack </summary>
<div markdown="1">

## Stack 선언

```java
import java.util.Stack;
Stack<Integer> stack = new Stack<>();
Stack<String> stack = new Stack<>();
Stack<Character> stack = new Stack<>();
```

## Stack 값 추가

```java
Stack<Integer> stack = new Stack<>();
stack.push(1); // 1 추가
stack.push(2); // 2 추가
```

## Stack 값 삭제

```java
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
stack.pop(); // stack 값 제거 - 2 제거
stack.clear(); // stack의 전체 값 제거(초기화)
```

## Stack 가장 상단 값 출력

```java
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
stack.peek(); // stack의 가장 상단 값 출력 - 2 출력
```

## Stack 기타 메서드

```java
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
stack.size(); // stack의 크기 출력:2
stack.empty(); // stack이 비어있는지 check (비어있다며 true)
stack.contains(1); // stack에 1이 있는지 check (있다면 true)
```

</div>
</details>
