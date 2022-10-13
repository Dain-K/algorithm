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
<summary> :pencil: String charAt() 메소드  </summary>
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
<summary> :pencil: getNumericValue() 메소드  </summary>
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