# Programmers java study

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

## 형변환

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

## String

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
<summary> :pencil: String toUpperCase() 메소드  </summary>
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
<summary> :pencil: String toLowerCase() 메소드  </summary>
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
<summary> :pencil: String trim() 메소드  </summary>
<div markdown="1">

## tring()

대상 문자열의 앞 뒤 공백 문자를 모두 제거하여 리턴해준다.

```java
String str1 = "   공백 제거   ";

System.out.println(str1.trim());
// 출력: 공백 제거
```

</div>
</details>

<details>
<summary> :pencil: String equals() 메소드  </summary>
<div markdown="1">

## equals()

- 두개의 문자열이 동일한지 비교한다.
</div>
</details>

## 문자열의 특정 인덱스 값 치환 방법

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
<summary> :pencil: Char toCharArray() - 문자열의 특정 인덱스 값 치환  </summary>
<div markdown="1">

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

<details>
<summary> :pencil: Arrays.sort()  </summary>
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
<summary> :pencil: string Arrays.asList().contains()  </summary>
<div markdown="1">

## Arrays.asList(yourArray).contains(yourValue)

스트링 배열에서특정 문자열이 포함되어있는지 확인하기

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

<details>
<summary> :pencil: ArrayList.indexOf()  </summary>
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
