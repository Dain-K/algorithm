# Java Study

### :pushpin: [형변환](https://github.com/Dain-K/algorithm/blob/master/JavaStudy/%ED%98%95%EB%B3%80%ED%99%98.md)

### :pushpin: Math

#### 소수점 올림/버림

<details>
<summary> :pencil: Math.ceil() </summary>
<div markdown="1">

## Nath.ceil()

- 소수점 올림, 정수 반환

```java
double pie = 3.14159265358979;
System.out.println("소수점 올림: " + Math.ceil(pie)); // 결과: 4
System.out.println("셋째 자리 올림: " + Math.ceil(pie * 100) / 100.0); // 결과: 3.15

```

</div>
</details>

<details>
<summary> :pencil: Math.floor()</summary>
<div markdown="1">

## Nath.floor()

- 소수점 버림, 정수 반환

```java
double pie = 3.14159265358979;
System.out.println("소수점 버림: " + Math.floor(pie)); // 결과: 3
System.out.println("넷째 자리 버림: " + Math.floor(pie * 1000) / 1000.0); // 결과: 3.141
```

</div>
</details>

#### 소수점 반올림

<details>
<summary> :pencil: Math.round()  </summary>
<div markdown="1">

## Nath.round()

- 실수의 소수점 첫번째 자리를 반올림하여 정수로 리턴
- 이를 활용하여 소수점 몇번째 자리까지 나타내는 것도 가능

```java
double pie = 3.14159265358979;
System.out.println(Math.round(pie)); // 결과: 3
System.out.println(Math.round(pie*100)/100.0); // 결과: 3.14
System.out.println(Math.round(pie*1000)/1000.0); // 결과: 3.142
```

</div>
</details>

<details>
<summary> :pencil: String.format()  </summary>
<div markdown="1">

## String.format()

- Math.round() 함수와 같이 소수점 n번째 자리까지 반올림하여 나타낼 수 있음

```java
double pie = 3.14159265358979;
double money = 4424.243423;

System.out.println(String.format("%.2f", pie)); // 결과: 3.14
System.out.println(String.format("%.3f", pie)); // 결과: 3.142
System.out.println(String.format("%,.3f", money)); // 결과: 4,424.243
```

</div>
</details>

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

<details>
<summary> :pencil: 문자열이 숫자인지 판단 함수  </summary>
<div markdown="1">

## 문자열이 숫자인지 판단 함수

```java
public class Example {

    public static void main(String[] args){
        System.out.println(isNumeric("1"));
        System.out.println(isNumeric("q1k"));
    }

    public static boolean isNumeric(String input){
        try{
            Integer.parseInt(input);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
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
  - 대상이 null 이면 NullPointerException 발생
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

System.out.println(str1.trim()); // 출력: 공백 제거
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
<summary> :pencil: String substring() - 문자열 자르기  </summary>
<div markdown="1">

## substring()

```java
public class Test{
    public static void main(String[] args){
        String str = "ABCDEFG";

        str.substring(3); // 결과값: DEFG
        str.substring(3,5); // 결과값: DE
        str.substring(str.length()-3, str.length()); // 결과값: EFG
    }
}
```

</div>
</details>
    
<details>
<summary> :pencil: String startsWith() / endsWith()  </summary>
<div markdown="1">

## startsWith()

- 대상 문자열이 특정 문자 또는 문자열로 시작하는지 체크하는 함수
- 해당 문자열로 시작되는지 여부를 확인하고 boolean에 맞춰 true/false 값을 리턴

```java
public class Example{
    public static void main(String[] args) {
        String s = "자바 코딩 테스트";
        System.out.println(s.startsWith("자")); // false
        System.out.println(s.startsWith("자바")); // true
        System.out.println(s.startsWith("자바 ")); // true
        System.out.println(s.startsWith("자바  ")); // false
    }
}
```

## endssWith()

- 대상 문자열이 특정 문자 또는 문자열로 끝나는지 체크하는 함수
- 해당 문자열로 시작되는지 여부를 확인하고 boolean에 맞춰 true/false 값을 리턴

```java
public class Example{
    public static void main(String[] args) {
        String s = "자바 코딩 테스트";
        System.out.println(s.endsWith("테스트")); // true
        System.out.println(s.endsWith("테")); // false
        System.out.println(s.endsWith("트")); // true
        System.out.println(s.endsWith(" 테스트")); // true
    }
}
```

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
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        integer arr[] = {9, 8, 47, 6, 15, 0, 90};
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
- `ArrayList` = Class
  <br/>
  List 와 ArrayList의 가장 큰 차이는 크기가 정해져 있지 않고 동적으로 변한다. <br/>
  예를 들어, 배열의 크기가 5라면 5개 이상의 값을 담을 수 없지만 list는 크기가 정해져있지 않아 원하는 만큼 값을 담을 수 있다. <br/>
  List 에는 ArrayList, Vector, LinkedList 등의 인터페이스를 구현한 자료형이 있다. <br/>
  즉, List 인터페이스 안에 ArrayList 클래스가 포함되어 있다.

```java
List<자료형> list = new ArraryList<>();
ArrayList<자료형> list = new ArrayList<>();
```

</div>
</details>

<details>
<summary> :pencil: List, ArrayList 출력  </summary>
<div markdown="1">

## List, ArrayList 출력

```java
public class test{
    public static void main(String[] args) {

        List<String> TestList = new ArrayList<String>();

        TestList.add("apple");
        TestList.add("ant");
        TestList.add("flower");

        /* 콘솔 출력 */
        // method 1
        for(String data: TestList){
            System.out.println(data);
        }

        // method 2
        for(for i = 0; i < TestList.size(); i++){
            System.out.println(TestList.get(i));
        }

        // method 3
        keyList.forEach(System.out::println);

        /* TestList 전체 출력 */
        System.out.println(TestList.toString());

    }
}
```

</div>
</details>

<details>
<summary> :pencil: add() - 인덱스 추가  </summary>
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
<summary> :pencil: get() - 특정 인덱스의 값을 추출  </summary>
<div markdown="1">

## get()

```java
System.out.println(pitches.get(1));
```

</div>
</details>

<details>
<summary> :pencil: size() -  ArrayList의 갯수를 리턴  </summary>
<div markdown="1">

## size()

```java
System.out.println(pitches.size());
```

</div>
</details>

<details>
<summary> :pencil: contains() -  리스트 안에 항목이 있는지 판별  </summary>
<div markdown="1">

## contains()

```java
System.out.println(pitches.contains("123"));
// 포함된 값일 경우 true 반환
```

</div>
</details>

<details>
<summary> :pencil: remove() -  리스트 객체에 해당되는 항목을 삭제  </summary>
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
<summary> :pencil: indexOf() - 리스트에 동일한 객체가 있는지 검색  </summary>
<div markdown="1">

## ArrayList.indexOf()

- indexof(object o)는 인자로 객체를 받는다.
- 리스트의 안쪽부터 인자와 동일한 객체가 있는지 찾는다.
- 존재하면 그 인덱스를 리턴한다.
- 존재하지 않는다면 -1 리턴한다.

### :one: example

```java
String[] fruitsArr = {"apple", "banana", "apple", "mango"};
ArrayList<String> fruits = new ArrayList<>(Arrays.asList(fruitsArray));

System.out.println("indexOF(apple): " + fruits.indexOf("apple")); // 0
System.out.println("indexOF(kiwi): " + fruits.indexOf("kiwi")); // -1
```

### :two: example

```java
int[] arr = {1,8,5,69,75,15,10};

int cellsIndex = Arrays.asList(arr).indexOf(75);
System.out.println("searched index " + cellsIndex); // 출력: 0
```

</div>
</details>

### :pushpin: 문자열의 특정 인덱스 값 치환 방법

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

### :pushpin: Map

<details>
<summary> :pencil: Map </summary>
<div markdown="1">

# 맵 (Map)

맵은 대응 관계를 쉽게 표현할 수 있게 해주는 자료형이다. 맵은 사전(dictionary)과 비슷하다.<br/>
리스트나 배열처럼 순차적으로 해당 요소 값을 구하지 않고 key를 통해 value를 얻는다. 맵(Map)의 가장 큰 특징이라면 key로 value의 값을 얻는다는 것이다. <br/>
helloWorld라는 단어를 찾기 위해 사전의 내용을 순차적으로 모두 검색하는 것이 아니라 helloWorld라는 단어가 있는 곳을 바로 확인할 수 있는 것이다.

- Map 역시 List 와 마찬가지로 인터페이스이다.
- Map 자료형: HashMap, LinkedHashMap, TreeMap 등

## HashMap

자바의 Map 중 가장 기본적인 Map이 HashMap 이다.

### put

- Map에 key, value 데이터 추가하기
- Key, Value에 String 이외의 자료형은 사용할 수 없다.

```java
import java.util HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("soccer", "축구");
    }
}
```

### get

key에 해당하는 value 값을 얻기 위해서는 get 메서드를 사용

```java
import java.util HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("soccer", "축구");
        System.out.println(map.get("people"));
    }
}

```

```
출력: 사람
```

### containsKey

맵(Map)에 해당 키(key)가 있는지를 조사하여 그 유무를 참, 거짓으로 리턴한다.

```java
import java.util HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("soccer", "축구");
        System.out.println(map.containsKey("people"));
    }
}

```

```
true
```

### remove

맵(Map)의 항목을 삭제하는 메서드로 key 값에 해당되는 아이템(key, value)을 삭제한 후 그 value 값을 반환한다.

```java
import java.util HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("soccer", "축구");
        System.out.println(map.remove("people"));
    }
}
```

```
사람
```

### size

맵(Map)의 개수를 반환한다.

```java
import java.util HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("soccer", "축구");
        System.out.println(map.size());
    }
}
```

```
2
```

### keySet

맵(Map)의 모든 Key를 모아서 반환한다.

```java
import java.util HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("soccer", "축구");
        System.out.println(map.keySet());
    }
}
```

```
[soccer, people]
```

keySet() 메서드는 Map의 모든 Key를 모아서 Set 자료형으로 리턴한다.
Set 자료형은 아래의 코드로 List 자료형으로 바꾸어 사용할 수도 있다.

```java
List<String> keyList = new ArrayList<>(map.keySet());
```

### getOrDefault

찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 dafault 값을 반환하는 메서드

#### :pushpin: 사용방법

```java
getOrDefault(Object key, V DefalutValue)
```

- key: map 요소의 키이다.
- dafaultValue: 지정된 키로 매핑된 값이 없거나 null 이면 반환하는 기본 값이다.

#### :pushpin: 예제

```java
import java.util.HashMap;

public class Example {
    public static void main(String arg[]) {
        String[] abc = {"A", "B", "C", "C"};
        HashMap<String, Integer> hashmap = new HashMap<>();

        for(String key: abc) {
            hashmap.put(key, hashmap.getOrDefault(key, 0) + 1);
        }

        System.out.println("출력결과: " + hashmap);
        // 출력결과: {A=1, B=1, C=2}
    }
}
```

</div>
</details>

<details>
<summary> :pencil: Map key, value로 정렬 </summary>
<div markdown="1">

## key 값을 기준으로 정렬

- map은 keySet을 이용하여 정렬
- 오름차순 시 Collection.sort()
- 내림차순 시 Collection.reverse()

```java
import java.util.*;

public class Example {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("D", 30);
        map.put("C", 20);
        map.put("B", 40);

        List<String> keySet = new ArrayList<>(map.keySet());

        // 키 값으로 오름차순 정렬
        Collections.sort(keySet);

        for(String key: keySet) {
            System.out.print("Key: " + key);
            System.out.println(", Val: " + map.get(key));
        }

        /* 결과
         * Key: A, Val: 10
         * Key: B, Val: 40
         * Key: C, Val: 20
         * Key: D, Val: 30
        */

        // 키 값으로 내림차순 정렬
        Collections.reverse(keySet);

        for(String key: keySet) {
            System.out.print("Key: " + key);
            System.out.println(", Val: " + map.get(key));
        }

        /* 결과
         * Key: D, Val: 30
         * Key: C, Val: 20
         * Key: B, Val: 40
         * Key: A, Val: 10
        */
    }
}
```

## Value 값을 기준으로 정렬하기

```java
import java.util.*;

public class Example {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("D", 30);
        map.put("C", 20);
        map.put("B", 40);

        List<String> keySet = new ArrayList<>(map.keySet());

        // Value 값으로 오름차순 정렬
        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, o2) {
                return map.get(o1).compareTo(map.get(o2));
            }
        })

        for(String key: keySet) {
            System.out.print("Key: " + key);
            System.out.println(", Val: " + map.get(key));
        }

        /* 결과
         * Key: A, Val: 10
         * Key: C, Val: 20
         * Key: D, Val: 30
         * Key: B, Val: 40
        */

        // Value 값으로 내림차순 정렬
        // 위 comparator 람다 표현식으로
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        for(String key: keySet) {
            System.out.print("Key: " + key);
            System.out.println(", Val: " + map.get(key));
        }

        /* 결과
         * Key: B, Val: 40
         * Key: D, Val: 30
         * Key: C, Val: 20
         * Key: A, Val: 10
        */
    }
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
        set.add(1);
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

### :pushpin: Heap

<details>
<summary> :pencil: Heap </summary>
<div markdown="1">

## Heap의 특징

- 힙은 완전 이진 트리 자료구조의 일종
  - 완전 이진 트리란 루트 노드부터 시작하여 왼쪽 자식 노드, 오른쪽 자식 노드 순서대로 데이터가 차례대로 삽입되는 트리(tree)를 의미
- 힙에서는 항상 루트 노드(root node)를 제거
- 최소 힙(min heap)
  - 루트 노드가 가장 작은 값을 가짐
  - 따라서 값이 작은 데이터가 우선적으로 제거
- 최대 힙(max heap)
  - 루트 노드가 가장 큰 값을 가짐
  - 따라서 값이 큰 데이터가 우선적으로 제거

## 최소 힙 구성 함수: Min-Heapify()

- (상향식) 부모 노드로 거슬러 올라가며, 부모보다 자신의 값이 더 작은 경우에 위치를 교체

### 힙에 새로운 원소가 삽입될 때

- 새로운 원소가 삽입되었을 때 O(logN)의 시간 복잡도로 힙 성질을 유지하도록 할 수 있음

### 힙에서 원소가 제거될 때

- 새로운 원소가 삽입되었을 때 O(logN)의 시간 복잡도로 힙 성질을 유지하도록 할 수 있음
- 이후에 루트 노드에서부터 하향식으로(더 작은 자식 노드로) Heapify()를 진행함

</div>
</details>

### :pushpin: Queue

<details>
<summary> :pencil: Priority Queue (우선 순위 큐) </summary>
<div markdown="1">

## Priority Queue

- FIFO(First In First Out) 구조
- 데이터가 들어온 순서대로 데이터가 나가는 것이 아닌, 우선순위를 먼저 결정하고 그 우선순위가 높은 데이터가 먼저 나가는 자료구조
- 물건 데이터를 자료구조에 넣었다가 가치가 높은 물건부터 꺼내서 확인해야할 때
- priority queue를 사용하기 위해서는 우선순위 큐에 저장할 객체는 필수적으로 Comparable Interface를 구현해야함
- priority queue는 Heap을 이용하여 구현하는 것이 일반적

### 특징

1. 높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조
2. 내부 요소는 힙으로 구성되어 이진트리 구조
3. 힙으로 구성되므로 시간복잡도는 O(NLogN)
4. 우선순위를 중요시해야하는 상황에서 주로 사용

### 선언

```java
import java.util.PriorityQueue;
import java.util.Collections;

// 낮은 숫자가 우선 순위인 int 형 우선 순위 큐 선언
PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();

//높은 숫자가 우선 순위인 int 형 우선순위 큐 선언
PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
```

### add

```java
priorityQueueLowest.add(1);
priorityQueueLowest.add(10);
priorityQueueLowest.offer(100);

priorityQueueHighest.add(1);
priorityQueueHighest.add(10);
priorityQueueHighest.offer(100);
```

### poll, remove, peek, element, clear

```java
// 첫번째 값을 반환하고 제거, 비어있다면 null
priorityQueueLowest.poll();

// 첫번째 값을 제거, 비어있다면 예외 발생
priorityQueueLowest.remove();

// 첫번째 값을 반환만 하고 제거하지 않음
// 큐가 비어있다면 null 반환
priorityQueueLowest.peek();

// 첫번째 값을 반환만 하고 제거하지 않음
// 큐가 비어있다면 예외 발생
priorityQueueLowest.element();

// 초기화
priorityQueueLowest.clear();


```

</div>
</details>

### :pushpin: 콘솔 입출력

<details>
<summary> :pencil: BufferedReader </summary>
<div markdown="1">

## BufferedReader

사용자가 엔터키를 입력할 때 까지 사용자의 입력을 받을 수 있다.

```java
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(str);
    }
}
```

```
입력: Hello World!
출력: Hello World!
```

</div>
</details>

<details>
<summary> :pencil: StringTokenizer </summary>
<div markdown="1">

## StringTokenizer

StringTokenizer 클래스는 문자열을 지정한 구분자로 문자열을 쪼개주는 클래스이다.
그렇게 쪼개어진 문자열을 우리는 토큰(token)이라고 부른다.

### 라이브러리

```java
import java.util.StringTokenizer;
```

### 생성자

생성자로는 3가지 방식이 있음

#### :one: StringTokenizer st = new StringTokenizer(문자열);

띄어쓰기 기준으로 문자열 분리

```java
import java.util.StringTokenizer;
public class Example {
    public static void main(String[] args) {
        String str = "hello world! Dain-k blog!"
        StringTokenizer st = new StringTokenizer(str);

        System.out.println(st.nextToken()); // hello
        System.out.println(st.nextToken()); // world!
        System.out.println(st.nextToken()); // Dain-k
        System.out.println(st.nextToken()); // blog!
    }
}
```

#### :two: StringTokenizer st = new StringTokenizer(문자열, 구분자);

구분자를 기준으로 문자열 분리

```java
import java.util.StringTokenizer;

public class Example {
    public static void main(String[] args) {
        String str = "문!자!열";
        StringTokenizer st = new StringTokenizer(str, "!", true);

        int i = 1;
        while(st.hasMoreTokens()){ // 다음 토큰이 있다면
            System.out.println((i++) + "번째 토큰: " + st.nextToken());
        }
    }
}
```

#### :three: StringTokenizer st = new StringTokenizer(문자열, 구분자, true/ false);

구분자를 기준으로 문자열을 분리할 때 구분자도 토큰을 넣을지 (true) 구분자는 분리된 문자열 토큰에 포함 안시킬지(false) (디폴트는 false)

```java

```

</div>
</details>

<details>
<summary> :pencil: Scanner </summary>
<div markdown="1">

## Scanner

```java
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
    }
}
```

</div>
</details>
